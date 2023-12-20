//Date :15th Nove 2023
//https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(currSum + nums[i] > nums[i]){
                currSum = currSum + nums[i];
            }else{
                currSum = nums[i];
            }

            maxSum = Math.max(maxSum, currSum);
            
        }
        return maxSum;
        
    }
}
