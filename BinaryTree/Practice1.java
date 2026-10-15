package BinaryTree;


public class Practice1 {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BuildingTree{
        static int idx = -1;
        public Node practiceTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = practiceTree(nodes);
            newNode.right = practiceTree(nodes);

            return newNode;
        }
    }

    public static void traversalPreOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data);
        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
        
    }

    public static void traversalPostorder(Node root){
        if(root == null) return;

        traversalPostorder(root.left);
        traversalPostorder(root.right);
        System.out.print(root.data);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, 7, -1, -1, -1, 3, -1, 6, -1, -1};
        BuildingTree q = new BuildingTree();
        Node root = q.practiceTree(nodes);
        System.out.println(root.data);
        traversalPreOrder(root);
        System.out.println();
        traversalPostorder(root);

    }
}
