//https://leetcode.com/problems/add-to-array-form-of-integer/description

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int p =num.length - 1;
        int carry = 0;
        while(p>=0 || k>0){
            int numval = 0;

            if(p>=0){
                numval = num[p];
            }

            int d = k%10;

            int sum = numval+d+carry;

            int digit  = sum % 10;

            carry = sum / 10;
            result.add(digit);

            p--;  
            k=k/10; //removing the last digit form k
        }
        if(carry > 0){
            result.add(carry); //adding carry to array list
        }
        Collections.reverse(result); //Reverse the ArrayList

        return result;

    }
}
