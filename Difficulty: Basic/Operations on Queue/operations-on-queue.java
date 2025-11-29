import java.util.*;

class myQueue {
    private LinkedList<Integer> list;

    public myQueue() {
        list = new LinkedList<>();
    }

    
    public void enqueue(int x) {
        list.addLast(x);
    }

    
    public void dequeue() {
        if (!list.isEmpty()) {
            list.removeFirst();
        }
    }

    
    public int getFront() {
        if (list.isEmpty()) return -1;
        return list.getFirst();
    }

    
    public int getRear() {
        if (list.isEmpty()) return -1;
        return list.getLast();
    }

   
    public boolean isEmpty() {
        return list.isEmpty();
    }

   
    public int size() {
        return list.size();
    }
}
