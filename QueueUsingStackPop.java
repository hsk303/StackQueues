import java.util.LinkedList;
public class QueueUsingStackPop {
    LinkedList<Integer>st= new LinkedList<>();
    LinkedList<Integer>temp= new LinkedList<>();
    /** Initialize your data structure here. */
    public QueueUsingStackPop() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        transfer(st,temp);
        st.addFirst(x);
        transfer(temp,st);
    }
    private void  transfer(LinkedList<Integer>st, LinkedList<Integer>temp){
        while(st.size()!=0){
            temp.addFirst(st.removeFirst());
            
        }
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       
        return st.removeFirst();
    }
    
    /** Get the front element. */
    public int peek() {
        return st.getFirst();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return st.size()==0;
    }
}
