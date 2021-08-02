import java.util.LinkedList;
public class StackusingqueuePush {
    LinkedList<Integer>qu= new LinkedList<>();
    LinkedList<Integer>temp= new LinkedList<>();
    int topEle=0;
    /** Initialize your data structure here. */
    public StackusingqueuePush() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        topEle=x;
        qu.addLast(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(qu.size()>1)
             temp.addLast(qu.removeFirst());
        int rev=qu.removeFirst();
        while(temp.size()!=0)
            this.push(temp.removeFirst());
        return rev;
    }
    
    /** Get the top element. */
    public int top() {
        return topEle;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return qu.size()==0;
    }
}
