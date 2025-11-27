// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
private Node top; 
    public myStack() {
        this.top=null;
    }

    public boolean isEmpty() {
       return top==null;
    }

    public void push(int x) {
        Node newNode=new Node(x);
        newNode.next=top;
        top=newNode;
    }

    public void pop() {
        if(isEmpty())return;
        int poppedData=top.data;
        top=top.next;
    }

    public int peek() {
        if(isEmpty())return -1;
        return top.data;
    }

    public int size() {
        int count=0;
        Node temp=top;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}