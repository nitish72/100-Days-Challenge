// Date: 31th Dec 2023
// https://leetcode.com/problems/merge-nodes-in-between-zeros/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
       ListNode dummy = new ListNode(-1);
       ListNode result = dummy;
       ListNode curr = head.next;
       int sum = 0;

       while(curr!=null){ //Current is not equals to Null till while loop run
         if(curr.val!=0){ //Check Current value is not Equals to 0
           sum = sum + curr.val; //Add the value to the current node
         }
         else{
             ListNode temp = new ListNode(sum); 
             dummy.next = temp; 
             dummy = dummy.next; //Dummy ki value ko increase krenge
             sum = 0;  //Sum ko 0 krna hoga
         }
         curr = curr.next; //Current value is current.next
       }
       return result.next;
    }
}
