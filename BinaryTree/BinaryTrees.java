package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

//This file conatins levelorder traversal,  postorder, preorder, inorder traversal. And the crreation of a binary tree through preorder.


public class BinaryTrees {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }

    static class preOrderTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);//construtor of class Node
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }

    static class inOrderTree{
        static int idx = -1;
        public static Node buildInOrder(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            buildInOrder(nodes);
        }
    }

    //PreOrder Traversal: root, left child, right child, null -> go back

    public static void preorderTraversal(Node root){
        if(root == null){
            System.out.print(-1 + ", ");
            return;
        }

        System.out.print(root.data+", ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
    }


    

    public static void inorderTraversal(Node root){
        if (root == null) {
            System.out.print(-1 + ", ");
            return;            
        }

        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);

    }

    public static void postOrderTraversal(Node root){
        if(root == null){
            System.out.print(-1 + ", ");
            return;
        }

        
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+", ");
        
    }

    public static void levelOrder(Node root){
        if(root == null){ //edge case
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = preOrderTree.buildTree(nodes);
        //System.out.println(root.data);

        // preorderTraversal(root);
        // System.out.println();
        // inorderTraversal(root);
        // System.out.println();
        // postOrderTraversal(root);
        levelOrder(root);
        
    }
    
    
}
