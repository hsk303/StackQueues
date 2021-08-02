import java.util.LinkedList;
public class QueueUsingLL {
   
    public class Stack{
    LinkedList<Integer> ll = new LinkedList<>();
    
    public int size(){
        return this.ll.size();
    }

    public Boolean IsEmpty(){
        return this.ll.isEmpty();
    }

    public void add(int data){
       ll.addLast(data);
    }

    public int remove(){
        return ll.removeFirst();
    }

    public int peek(){
        return ll.getFirst();
    }
}

}


