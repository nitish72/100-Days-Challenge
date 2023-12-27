// Date : 27th Dec 2023
// https://leetcode.com/problems/linked-list-cycle-ii/

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
    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode ptr = head;
//Hme jbtk move krna tb tk ki fast node null na ho jaye
        while(fast!=null && fast.next!=null){
            fast = fast.next.next; //Fast node ko 2 point move krna h
            slow = slow.next;  //slow node ko 1 point move krna h

            if(slow == fast ){ //there is a cycle in LL
                while(ptr!=slow){ //Tbtk move krna jbtk ki pointer and slow match na kre
                    ptr = ptr.next; 
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
