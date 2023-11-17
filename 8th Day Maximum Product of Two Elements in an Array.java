//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Solution {
    public int maxProduct(int[] nums) {

        int max = -1;
        int secondMax = -1;

        for(int i=0; i<nums.length;i++){
            //Here we compare the max value to the array index
            //swap the values ;
            if(max < nums[i]){
                secondMax =max; // First we store the max value in the secindMax
                max = nums[i];  // After the value of the array index in the max 
            }
            else if(secondMax < nums[i]){  //Here we compare the max value to the array index
            // if yes then swap their values
               secondMax = nums[i];
            }
        }
        int result = (max-1) * (secondMax-1);
        return result;
        
    }
}
