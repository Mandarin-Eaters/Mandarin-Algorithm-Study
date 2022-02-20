import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            tree.addNode(st.nextToken(), st.nextToken(), st.nextToken());
        }

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }
}

class Node {
    public String data;
    public Node left;
    public Node right;

    public Node(String data) {
        this.data = data;
    }
}

class Tree {
    public Node root;

    public void addNode(String data, String left, String right) {
        if (root == null) {
            root = new Node(data);
            if (!left.equals(".")) {
                root.left = new Node(left);
            }
            if (!right.equals(".")) {
                root.right = new Node(right);
            }
        } else {
            searchNode(root, data, left, right);
        }
    }

    public void searchNode(Node node, String data, String left, String right) {
        if (node == null) {
            return;
        }

        if (node.data.equals(data)) {
            if (!left.equals(".")) {
                node.left = new Node(left);
            }

            if (!right.equals(".")) {
                node.right = new Node(right);
            }
        } else {
            searchNode(node.left, data, left, right);
            searchNode(node.right, data, left, right);
        }
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data);
        inorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data);
    }
}