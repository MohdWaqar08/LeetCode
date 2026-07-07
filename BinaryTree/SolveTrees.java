package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.BinaryTrees;

public class SolveTrees {

    
    public static int countNodes(BinaryTrees.Node root){
        if(root == null){
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
        
    }

    public static int sumOfNodes(BinaryTrees.Node root){ //This is based on DFS traversal
        if(root == null) return 0;

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int heightOfTree(BinaryTrees.Node root){ //This is to measure the height of the tree. This is based on BFS
        if(root == null){
            return 0; 
        }
        int count = 1;
        Queue<BinaryTrees.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);


        while (!q.isEmpty()) {
            BinaryTrees.Node currNode = q.remove(); //In first iteration: currNode will be "root"
            if(currNode == null){
                count++;
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(currNode.left != null){
                    q.add(currNode.left);
                } 
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

        return count-1;
    }

    public static int height(BinaryTrees.Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight)  + 10;

        return maxHeight;
    }

    public static void main(String[] args) {
        //int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] nodes = {1, 2, 4, 8, 15, -1, -1, -1, 9, -1, -1, 5, -1, 10, -1, 16, -1, -1, 3, 6, 11, -1, -1, -1, 7, 12, -1, -1, 13, -1, 14, -1, -1};
        BinaryTrees.Node root = BinaryTrees.preOrderTree.buildTree(nodes);
        System.out.println(heightOfTree(root));
        System.out.println(height(root));
        
    }
}
