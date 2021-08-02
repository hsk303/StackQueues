import java.util.LinkedList;
public class StackUsingQueuePop {
    LinkedList<Integer> qu= new LinkedList<>();
    LinkedList<Integer> temp= new LinkedList<>();
    int topEle=0;
    /** Initialize your data structure here. */
    public StackUsingQueuePop() {
        
    }
    private void transfer(LinkedList<Integer>qu, LinkedList<Integer>temp){
        while(qu.size()!=0){
            temp.addLast(qu.removeFirst());
        }
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        temp.addFirst(x);
        transfer(qu,temp);
        LinkedList<Integer>temp1=qu;
        qu=temp;
        temp=temp1;

    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return qu.removeFirst();
    }
    
    /** Get the top element. */
    public int top() {
        return qu.getFirst();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return qu.size()==0;
    }
}
