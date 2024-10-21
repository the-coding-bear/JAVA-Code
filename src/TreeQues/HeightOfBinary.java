package TreeQues;

public class HeightOfBinary {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }


        // Function to find the height of a binary tree.
        int height(Node node) {
            // Base case: An empty tree has height -1
            if (node == null) {
                return -1;  // Returning -1 as per common definition, can return 0 if considering height of empty tree as 0
            }

            // Recursively find the height of left and right subtrees
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            // The height of the current node is the maximum of the two heights plus 1
            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static void main(String[] args) {
            HeightOfBinary tree = new HeightOfBinary();

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.left.left = new Node(6);
            root.left.right.left = new Node(7);
            root.left.right.left.right = new Node(8);
            root.left.right.left.left = new Node(10);
            root.left.right.left.left.left = new Node(9);
            root.left.right.left.left.right = new Node(11);
            root.left.right.left.left.right.left = new Node(12);
            root.left.right.left.left.right.right = new Node(13);




            System.out.println("The height of the binary tree is: " + tree.height(root));
        }


}
