//https://leetcode.com/problems/merge-two-sorted-lists/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); //It is the effective way to solve the LinkedList always 
        ListNode ans = dummy; //We have to store the dummy address
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
//while loop run until the ptr1 & ptr2 is not empty
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val<ptr2.val){
                dummy.next=ptr1;
                ptr1=ptr1.next; //LinkedList list1 increase 
            }else{
                dummy.next=ptr2;
                ptr2 = ptr2.next; // LinkedList list2 increase
            }
            dummy = dummy.next;
        }
        if(ptr1==null){ //Here we check the ptr1 is empty or not
            dummy.next=ptr2;
        }else{           //HEre we have to check wheater the ptr2 is empty or not
            dummy.next=ptr1;
        }
        return ans.next; //-1 is the dummy pointer address So we have to start with ans.next;
    }
}
