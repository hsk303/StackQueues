import java.util.LinkedList;
public class QueueUsingStackPush {
    LinkedList<Integer>st= new LinkedList<>();
    LinkedList<Integer>temp= new LinkedList<>();
    int peekEle=0;
    /** Initialize your data structure here. */
    public QueueUsingStackPush() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(st.size()==0)
            peekEle=x;
        st.addFirst(x);
    }
    private void  transfer(LinkedList<Integer>st, LinkedList<Integer>temp){
        while(st.size()!=0){
            temp.addFirst(st.removeFirst());
            
        }
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        transfer(st,temp);
        int rev=temp.removeFirst();
        while(temp.size()!=0)
            this.push(temp.removeFirst());
        return rev;
    }
    
    /** Get the front element. */
    public int peek() {
        return peekEle;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return st.size()==0;
    }
}
