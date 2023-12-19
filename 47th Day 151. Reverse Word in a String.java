// Date : 3rd Dec 2023
//https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {

        String[] arr=s.split("\\s+"); //Split basis of spaces

        StringBuilder sb = new StringBuilder("");
        
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i] + " ");
        }
        //trim function --> removing trailing ans leading spaces

        String ans = sb.toString();
        ans= ans.trim();

        return ans;
        
    }
}
