import java.util.LinkedList;
import java.util.Arrays;
public class questions {
    public static boolean balancedBrackets(String str) {
        LinkedList<Character> st = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                st.addFirst(ch);
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.size() == 0) // more closing brackets
                    return false;
                else if (ch == ')' && st.getFirst() != '(')
                    return false;
                else if (ch == ']' && st.getFirst() != '[')
                    return false;
                else if (ch == '}' && st.getFirst() != '{')
                    return false;
                else
                    st.removeFirst();
            }
        }

        return st.size() == 0; // more opening brackets
    }

    public static Boolean duplicateBrackets(String str){
        LinkedList<Character> st= new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            Boolean isLooprun=false;
            while(st.size()!=0 && ch==')' && st.getFirst()!='('){
                isLooprun=true;
                st.removeFirst();
            }
            if(!isLooprun && ch==')')
               return true;
            else if(isLooprun)
                     st.removeFirst();
            else{
                st.addFirst(ch);
            }       
        }
        return false; 
    }

    public static void nextGreater(int[] arr){
        int n= arr.length;
        int[] ans= new int[n];
        Arrays.fill(ans,-1);
        LinkedList<Integer> st= new LinkedList<>();
        for(int i=0;i<n;i++){
            while(st.size()!=0 && arr[i]>arr[st.getFirst()])
               ans[st.removeFirst()]=arr[i];
            st.push(i);
        }
       for(int ele: ans)
           System.out.println(ele);
    }

    public static void mergeOverlappingIntervals(int[][] arr){
        LinkedList<int[]> st= new LinkedList<>();
        Arrays.sort(arr, (a,b)->{
           return a[0]-b[0];
        });
        for(int[] a: arr){
            int minStartTime=a[0];
            int maxEndTime=a[1];
            while(st.size()!=0  && a[0]<=st.getFirst()[1]){
                minStartTime= st.getFirst()[0];
                maxEndTime= Math.max(maxEndTime, st.getFirst()[1]);
                st.removeFirst();
            }
            st.addFirst(new int[]{minStartTime, maxEndTime});
        }

        while(st.size()!=0){
            int[] a= st.removeLast();
            System.out.println(a[0]+" "+a[1]);

        }
    }
}
