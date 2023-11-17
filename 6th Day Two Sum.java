class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* Here we have to return two index of the Array 
        so there for we assign a new Array of size 2*/
        int[] result = new int[2];
        // We have to traverse the element of the Array
        for(int i=0; i<nums.length; i++){
        // The second loop is for traverse the second elemnent of the Array
            for(int j=i+1; j<nums.length; j++){
                // Here we compare the first index and second index element sum is equals to the target  
               if(nums[i] + nums[j] == target){
            // assign the index of the values that is equal to the target  
                 result[0]=i;
                 result[1]=j;
               }
            }
        }
        return result;
    }
}
