//Date : 1st Dec 2023
//https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for(int i =s.length()-1;i>=0;i--){
            char ch = s.charAt(i);

            if(ch!=' '){
                count++;
            }else if (count!=0){
                break;
            }
        }
        return count;
        
    }
}
