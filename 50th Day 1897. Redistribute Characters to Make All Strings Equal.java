// Date: 6th Dec 2023
//https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
class Solution {
    public boolean makeEqual(String[] words) {
        int[] frequency = new int[26]; //the total Alphabates is 26
//This loop is for take one word from the array such as [aaa,bbb,ccc] -> aaa or bbb or ccc
        for(int i =0;i<words.length;i++){
            String w= words[i];
//This loop is for characters of the words such as abcd = 'a','b','c','d'
            for(int j=0;j<w.length();j++){
                char ch =w.charAt(j);
                int index = (int)(ch-'a');
                frequency[index] = frequency[index] + 1;
            }
        }
        for(int i =0;i<frequency.length;i++){
            if(frequency[i]%words.length!=0){
                return false;
            }
        }
        return true;
        
    }
}
