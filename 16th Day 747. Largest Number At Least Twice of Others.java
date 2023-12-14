//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex= 0; //We have to store the index of max
        int max = -1; 
        int secondMax = -1;
     
       for(int i=0;i<nums.length;i++){
           if(max < nums[i]){ //if max is less than nums[i]
               secondMax = max; //Store the value of max in the secondMax
               max = nums[i];   // and then after value of nums[i] in max
               maxIndex = i; //Here we store the index of max

           }else if(secondMax < nums[i]){ //secondMax is less than nums[i]
               secondMax = nums[i];
           }
       }
        if(secondMax * 2 <= max){
           return maxIndex;
        }else {
            return -1;
        }     
    }
}
