//Date : 17th Nove 2023
//https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int number = 0;
        int count = 0;

        for(int element : nums){
            if(element == target){
                count++;

            }else if(element < target){
                number++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        while(count>0){
            result.add(number);
            number++;
            count--;       
         }
         return result;
    }
}
