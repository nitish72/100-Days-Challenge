//https://leetcode.com/problems/palindrome-linked-list/ 17/12/23

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
    public boolean isPalindrome(ListNode head) {
        //We have to use Stacks
        Stack<Integer> st = new Stack<>();
        ListNode ptr = head;
//Push into the stack utill it is not empty
        while(ptr!=null){
       st.push(ptr.val);
       ptr=ptr.next;
        }
        ListNode ptr2=head;
//To Check the stack is empty or not and return true if all empty and false it stack is not Empty 
        while(ptr2!=null){
            int val1=ptr2.val;
            int val2=st.pop();

            if(val1 != val2){
                return false;
            }
            ptr2=ptr2.next;
        }
        return true;
    }
}
