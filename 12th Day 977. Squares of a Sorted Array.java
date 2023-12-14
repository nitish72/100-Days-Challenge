//https://leetcode.com/problems/squares-of-a-sorted-array/
class Solution {
    public int[] sortedSquares(int[] nums) {

//This question is using three pointers to solve the problem
// Here we assign a new array to store the square of the number in the array
        int[] result = new int[nums.length];
        
        int start = 0;
        int end = nums.length-1;

       int k = result.length-1; 
        while(start <= end){
            int startSquare = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];
// Compare the squarw of startindex as well as endindex
            if(startSquare < endSquare){
              result[k] = endSquare;
              end --; //Decrease the endindex
            }
            else {
                result[k] = startSquare;
                start++;   //Increase the startindex  
            }
            k--; //It will decrease because it start with end position because we store the square a end
        }
        return result;   
    }
}
