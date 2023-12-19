//Date : 2nd Dec 2023
//https://leetcode.com/problems/remove-duplicate-letters/
class Solution {
    public String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26]; 

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = (int)(ch-'a');    
            
            lastIndex[index] =i;
        } 
        boolean[] present  = new boolean[26];

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = (int)(ch-'a'); 
            
            if(present[index]==false){
 while(st.size()>0 && st.peek()>ch && lastIndex[(int)(st.peek()-'a')]>i){
  present[(int)(st.peek()-'a')] =false;
  st.pop();
                 }  
                 st.push(ch);
                 present[index]=true;
            }     
            
        } 
        StringBuilder sb = new StringBuilder("");
        while(st.size()>0){
            sb.append(st.pop());
        } 
        return sb.reverse().toString();   
    }
}
