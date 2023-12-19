//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Date : 19 Dec 2023 

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
    public ListNode deleteDuplicates(ListNode head) {
        //Check the node is not null or after head node it was null if any case exist return head because the head tag is only one element.
        if(head ==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(head.val); //We take the dummy node for the head value
        ListNode ans = dummy; //We have to store the dummy node in the ans variable because we lost the data of dummy if we not stored.
        ListNode ptr = head.next;
        while(ptr!=null){
            if(ptr.val!=dummy.val){
                ListNode temp = new ListNode(ptr.val);
                dummy.next = temp;
                dummy = dummy.next;
            }
            ptr=ptr.next;
        }
        return ans;
    }
}
