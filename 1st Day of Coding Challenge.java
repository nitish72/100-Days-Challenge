
package com.HundredDays_Challenge.edSlash;

public class DSA_1stDay_Pallindrome_of_Number {
    public static boolean pallindrome(int num){
        if(num < 0){
            return false;
        }
        int revNum = 0;
        int temp = num;
        while ( num > 0){
            int rem = num % 10;
             revNum = revNum * 10 + rem;
             num = num / 10;

        }
        if(revNum == temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num= 1451;
        System.out.println(pallindrome(num));
    }
}
