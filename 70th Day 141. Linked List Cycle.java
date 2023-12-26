// Date : 26th Dec 2023
//https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //We check here to the head is not noll and head k agle wala element khali h
       if(head == null || head.next == null){
           return false;
       } 
    // Yahan ham do node lenge taki hm node ko fast forward krenge 
    //Fast ko head k 2 baad rakhenge and slow node ko hm head k 1 node k baad rakhnge
       ListNode slow = head;
       ListNode fast = head;
// while jbtk ki node hmara null na ho jaye
       while(fast!=null && fast.next!=null){
           fast = fast.next.next;
           slow= slow.next;
// check krenge ki fast node aur slow node ek dusre k barabar h ya nhi agr hai to true 
           if(fast == slow){
               return true;
           }
       }// nhi hai to false
       return false;
    }
}
