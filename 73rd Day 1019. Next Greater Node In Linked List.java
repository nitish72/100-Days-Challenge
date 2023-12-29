// Date : 29th Dec 2023
//https://leetcode.com/problems/next-greater-node-in-linked-list/description/
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
class Solution {  //This question is divided into 3 parts 
// 1. To find the size of Linked List
// 2. Reverse the Linked Linst
// 3. Using Stack push and pop methods
    //  Step 1 Find the size of the LinkedLiat 
   public int sizeLL(ListNode head){
       ListNode curr = head;
       int count = 0;
       while(curr!=null){
           count++;
           curr = curr.next;
       }
       return count;
   }
   //Step 2 Reverse Logics 
   public ListNode reverseLL(ListNode head){
       ListNode curr = head;
       ListNode pre = null;
       while(curr!= null){
           ListNode temp = curr.next;
           curr.next = pre;
           pre = curr;
           curr = temp;
       }
       return pre;
   }
// Step 3 Stack methods push and pop 
    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] arr = new int[size];
        ListNode newHead = reverseLL(head);
        Stack<Integer> st = new Stack<>();
        st.push(newHead.val);
        ListNode curr = newHead.next;
        int ptr = size-2;
        while(ptr >= 0){
            int ele = curr.val;
            curr=curr.next;
        //check and pop
        while(st.size() > 0 && st.peek() <= ele){
             st.pop();
           }
           //put in array 
           if(st.size()==0){
               arr[ptr]=0;
           }else{
               arr[ptr] = st.peek();
           }
           //push eleements in stack
           st.push(ele);
               ptr--;       
        }
        return arr;
    }
}
