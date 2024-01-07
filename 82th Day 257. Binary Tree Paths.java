// Date 07 Jan 2024
// https://leetcode.com/problems/binary-tree-paths/description/

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>(); // Line A
        //Check whether the root is null or not
        if(root==null){  //Line A
            return ans;  //Line A
            //Check whether the right node and left node in null
        }else if(root.left == null && root.right == null){ //Line A
            ans.add(""+root.val); //Line A
            return ans; //Line A
        }

        List<String> leftAns = binaryTreePaths(root.left); // Line B
        List<String> rightAns= binaryTreePaths(root.right); //Line C

        for(String str : leftAns){    //Line D
            ans.add(root.val +"->"+ str);  //Line D
        }
        for(String str : rightAns){ //Line D 
            ans.add(root.val + "->"+ str); //Line D
        }
        return ans; //Line E
        
    }
}
