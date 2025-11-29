/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
         if(head == null){
            return new Node(x);
        }
        
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        
        lastNode.next = new Node(x);
        
        return head;
    }
}