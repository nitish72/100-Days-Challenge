//https://leetcode.com/problems/consecutive-characters/
// Date: 7th Dec 2023

class Solution {
    public int maxPower(String s) {
        int max=1;
        int count=1;

    for(int i=1;i<s.length();i++){
        int curr=s.charAt(i); //Here the current value at second index
        int prev=s.charAt(i-1); //Previous value at the first index
        //Compare with the current and Previous Substring if equal the count is increment 
        if(curr==prev){
            count++;
          }else{  //If no then compare the value to max and count which is larger then return and count value become 1
              max=Math.max(max,count);
              count=1;
           }
      }
      //We have to return the Maximum Length of Substring 
       max=Math.max(max,count);
       return max;
    }
}
