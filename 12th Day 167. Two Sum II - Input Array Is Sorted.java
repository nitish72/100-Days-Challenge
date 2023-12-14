//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //Binary Search Approach  
        int[] result =new int[2];
        int start=0;
        int end = numbers.length-1;
    //Run the while loop until the start is less that end pointer
       while(start < end){
           // add the sum
         int sum = numbers[start] + numbers[end];
    
         if(sum == target){// if the condition is true the return the index + 1;
             result[0] = start + 1; 
             result[1] = end + 1;
             return result;
         }else if (sum > target){
             end--;
         }else {
             start++;
         }
       }
        return result;      
    }
}
