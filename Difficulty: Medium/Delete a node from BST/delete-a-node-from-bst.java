// Node class is provided by GFG:
// class Node {
//     int data;
//     Node left, right;
//     Node(int item) {
//         data = item;
//         left = right = null;
//     }
// }

class Solution {
    private Node minValueNode(Node node) {
        Node current = node;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }
    public Node delNode(Node root, int x) {
        if (root == null) return null;

        if (x < root.data) {
            root.left = delNode(root.left, x);
        } else if (x > root.data) {
            root.right = delNode(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node succ = minValueNode(root.right);
            root.data = succ.data;
            root.right = delNode(root.right, succ.data);
        }

        return root;
    }
}
