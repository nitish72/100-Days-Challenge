// Date: 30th Nov 2023
//https://leetcode.com/problems/boats-to-save-people/
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //Sort with Array function
        Arrays.sort(people);

        int start = 0;
        int end = people.length - 1;
        int count = 0;

        while(start <= end){
   //Compare the people index and end index to the limit 
            if(people[start]+people[end] <=limit){
                start++;
                end--;
            }else{
                end--;
            }
            //Hme count ko aage badana padega
            count++;

        }
        return count;
    }
}
