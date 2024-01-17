// Date : 17th Jan 2024
// https://leetcode.com/problems/search-in-a-binary-search-tree/description/

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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
//Using Binary Search Tree 
        while(temp!=null){
            if(temp.val == val){
                break;
            }
            else if(temp.val > val){
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        return temp;
    }
}
