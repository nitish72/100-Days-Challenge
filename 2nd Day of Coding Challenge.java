
package com.HundredDays_Challenge.edSlash;

public class DSA_2nd_Day_231_Power_of_Two {
    public static boolean power_Of_Two(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            if (n == 1) {
                return true;
            }
            return false;

        }
    }
    public static void main(String[] args) {
        System.out.println(power_Of_Two(312));

    }
}
