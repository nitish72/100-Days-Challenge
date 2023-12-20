// Date : 22th Nove 2023
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
class Solution {
    public double average(int[] salary) {

        int max=salary[0];
        int min=salary[0];
        int sum = salary[0];

        for(int i=1;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            } if(salary[i]<min){
                min=salary[i];
            }
            sum = sum+salary[i];
        }
        sum = sum-max-min;
        double result = (double) sum/(salary.length-2);
        return result;
    }
}
