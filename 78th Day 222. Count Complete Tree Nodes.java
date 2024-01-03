// Date : 03 Jan 2024
//https://leetcode.com/problems/count-complete-tree-nodes/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){ //root is null 
            return 0;
        }
        int leftAns = countNodes(root.left); // a it will count the all left nodes
        int rightAns = countNodes(root.right); //b it will count all the right nodes

        return leftAns+rightAns+1; //c total sum last me return kr denge
        
    }
}

