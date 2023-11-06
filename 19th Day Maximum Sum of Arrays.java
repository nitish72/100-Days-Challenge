
package com.HundredDays_Challenge.edSlash;

public class DSA_19thDays_Sum_of_Arrays {
    public static int sumofArrays(int nums[]){
        int max=nums[0];
        int currentmax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<nums[i]){
                currentmax=currentmax+nums[i];
            }
            else {
                max = Math.max(max ,currentmax);
                currentmax=nums[i];
            }
        }
        max=Math.max(max, currentmax);
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,6,7,8,3,9,10,2,5};
        System.out.println(sumofArrays(nums));

    }
}
