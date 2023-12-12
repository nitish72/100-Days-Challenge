package com.Hundred_Days_Code_Challenge;

public class Day10th_268_Missing_Number {

        public static int missingNumber(int[] nums) {

//Take the size of array in a variable
            int totalNumber = nums.length;
//Here we add formula of totalSum of 'n' which is "totalSum = (n * (n+1)/2)";
            int totalSum = (totalNumber * (totalNumber + 1))/2;

// Take a temp variable that can store the sum of Array
            int  tempArraySum= 0;
// Itrate the array to find the total sum of Array
            for(int i = 0; i < nums.length; i++){
                tempArraySum = tempArraySum + nums[i];

            }
            // because their is one trick in totalSum - tempArraySum is equals to missing number
            int result = totalSum - tempArraySum;
            return result;

        }
    public static void main(String[] args) {
       int nums[] ={9,6,4,2,3,5,7,0,1};
        System.out.println("Missing numbers "+missingNumber(nums));
    }
}
