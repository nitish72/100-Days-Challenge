// Date 14th Nove 2023
// https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        //We use 3 Pointer to approach this
        //This is based on the Dutch National Flag Algorithm
        //Here mid and low both are same position
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,high,mid);
                    high--;
                }
            }
        }//Here we create a seprate sawp function 
        public void swap(int[] nums, int i, int j){
            int k=nums[i];
            nums[i] = nums[j];
            nums[j]=k;
        }
    }
