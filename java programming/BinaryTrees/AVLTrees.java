package BinaryTrees;

public class AVLTrees {
    // Node structure for AVL Tree
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1; // Height of a new node is set to 1
        }
    }

    public static Node root;

    // Utility to get the height of a node
    public static int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Utility to get the maximum of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Perform a right rotation
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return the new root
        return x;
    }

    // Perform a left rotation
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return the new root
        return y;
    }

    // Get the balance factor of a node
    public static int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    // Insert a node into the AVL tree
    public static Node insert(Node node, int data) {
        // Perform standard BST insertion
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            // Duplicate data is not allowed
            return node;
        }

        // Update the height of the ancestor node
        node.height = 1 + max(height(node.left), height(node.right));

        // Get the balance factor to check if the node is unbalanced
        int balance = getBalance(node);

        // If the node becomes unbalanced, there are 4 cases:

        // Left Left Case
        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the unchanged node
        return node;
    }

    // Print the tree (in-order traversal)
    public static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    // Main method to test the AVL Tree
    public static void main(String[] args) {
        AVLTrees tree = new AVLTrees();

        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        System.out.println("In-order traversal of the AVL tree:");
        inOrder(root);
    }
}

