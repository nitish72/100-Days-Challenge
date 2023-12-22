//Date : 12th Nove 2023
//https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length < 0 ){
            return -1;
        }
        int start =0;
        int end = nums.length - 1;
        while(start <= end){
         int mid = start + (end-start)/2;
         if(nums[mid] < target){
             start = mid+1;
             end = end;
         }else if (nums[mid] > target){
           end = mid - 1;
           start = start;
          }else { //when (mid == target)
              return mid;  
               }  
        }
        return start;   
    }
}
