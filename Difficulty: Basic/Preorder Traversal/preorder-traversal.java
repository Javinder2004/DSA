/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
         ArrayList<Integer> list = new ArrayList<>();
        preorderHelper(root, list);
        return list;
    }
    
    private void preorderHelper(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.data);
        preorderHelper(root.left, list);
        preorderHelper(root.right, list);
    }
}