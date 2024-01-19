// Date : 19th Jan 2024
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null){ //Check the root is not null
           return null;
       } 
       TreeNode temp = root; //Traverse the TreeNode, Store the Value int Temp

       while(temp!=null){
           //Temp ki value badi hai p.val se aur temp.val ki value badi hai q.val se then shift to left
          if(temp.val > p.val && temp.val > q.val){
              temp = temp.left;
          } 
          // //Temp ki value chhoti hai p.val se aur temp.val ki value chhoti hai q.val se then shift to right
          else if(temp.val < p.val && temp.val < q.val){
              temp=temp.right;
          }
          else{
              break;
          }
       }
       return temp;
    }
}
