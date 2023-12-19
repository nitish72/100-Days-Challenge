// Date 29th Nove 2023
//https://leetcode.com/problems/find-pivot-index/
class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum=0;

        for(int i=0;i<nums.length;i++)
          
           {
                rightSum = rightSum + nums[i];
           }

          int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            rightSum = rightSum - nums[i];

            if(rightSum == leftSum){
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
