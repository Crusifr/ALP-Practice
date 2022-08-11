class Node {
    int info;
    Node right;
    Node left;
    public Node(int info) {
        this.info = info;
    }
}
class Tree {
    Node root;
    public void addNode(int info) {
        int data=info;
        Node newNode = new Node(data);

        if (root == null) {

            root = newNode;

        } else {

            Node currentNode = root;
            Node parent;

            while (true) {

                parent = currentNode;

                if (data < currentNode.info) {

                    currentNode = currentNode.left;

                    if (currentNode == null) {

                        parent.left = newNode;
                        return;

                    }
                } else {

                    currentNode = currentNode.right;

                    if (currentNode == null) {

                        parent.right = newNode;
                        return;

                    }
                }

            }
        }
    }
    public int countNodes(Node r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
    public void inOrderTravers(Node currentNode) {
        if (currentNode != null) {
            inOrderTravers(currentNode.left);
            System.out.println(currentNode.info);
            inOrderTravers(currentNode.right);
        }
    }
    public void preOrderTravers(Node currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode.info);
            inOrderTravers(currentNode.left);
            inOrderTravers(currentNode.right);
        }
    }
    public void postOrderTravers(Node currentNode) {
        if (currentNode != null) {
            inOrderTravers(currentNode.left);
            inOrderTravers(currentNode.right);
            System.out.println(currentNode.info);
        }
    }
    public Node find(int info) {
        Node currentNode = root;
        if (currentNode == null) {
            return null;
        }
        while (currentNode.info != info) {
            if (info < currentNode.info) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return currentNode;
    }
}
public class BinaryTreeTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(1);
        tree.addNode(3);
        tree.addNode(5);
        tree.addNode(8);
        tree.addNode(65);
        tree.addNode(17);
        tree.addNode(19);
        tree.addNode(21);
        tree.addNode(35);
        int count = tree.countNodes(tree.root);
        System.out.println("Nodes | " + count);
        System.out.println("_" + "\n");
        tree.inOrderTravers(tree.root);
        System.out.println("_" + "\n");
        Node serachNode = tree.find(19);
        System.out.println("Found Node - info | " + serachNode.info);
    }
}