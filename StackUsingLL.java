import java.util.LinkedList;
public class StackUsingLL {
    public class Stack{
    LinkedList<Integer> ll = new LinkedList<>();
    
    public int size(){
        return this.ll.size();
    }

    public Boolean IsEmpty(){
        return this.ll.isEmpty();
    }

    public void push(int data){
       ll.addFirst(data);
    }

    public int pop(){
        return ll.removeFirst();
    }

    public int top(){
        return ll.getFirst();
    }
}

}
