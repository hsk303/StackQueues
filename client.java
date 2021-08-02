import java.util.*;
public class client {
    public static void main(String[] args) throws Exception{
        // Stack st= new Stack();
        // st.push(20);
        // st.push(30);
        // System.out.println(st.top());
        // System.out.println(st);

        // Queue que= new Queue();
        // que.add(10);
        // que.add(20);
        // que.remove();
        // System.out.println(que.peek());
        // System.out.println(que);
        
        // stackBehaviorUsingLL();
        // questions q= new questions();
        // Scanner sc= new Scanner(System.in);
        // String str= sc.nextLine();
        // System.out.println(q.duplicateBrackets(str));
        
        questions q= new questions();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        q.nextGreater(arr);
        
    }

    // public static void stackBehaviorUsingLL(){
    //     LinkedList<Integer>st= new LinkedList<>();
    //      for(int i=1;i<=10;i++)
    //         st.addFirst(i*10);
    //     System.out.println(st);
    //     while(st.size()!=5){
    //         System.out.println(st.remove());
    //     }
    // }
    

}
