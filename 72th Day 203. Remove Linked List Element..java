//Date : 28th Dec 2023
//https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1); //Ek dummy node create kiya 
        dummy.next = head; //dummy node ko hmne head se jod diya
        ListNode curr = dummy; //Currenct node ko hm dummy se intialize kr denge
        while(curr.next!=null){ //Kb tk run krna jbtk ki curr ki agli value null na ho
            if(curr.next.val==val){ //Check krenge ki current next ki value kahi target k equal to nhi h
                curr.next = curr.next.next; //Agr hi to hme curr.next me curr.next.next ki value bhar do
            }else{
                curr = curr.next; //Aur aisa nhi h to current me current.next intialize kr do
            }
        }
        return dummy.next; //return kr do dummy.next ko kyu ki head hmara dummy.next pr rakha h
    }
}
