
package com.HundredDays_Challenge.edSlash;

public class DSA_3stDay_Fibonacci_Series {
    public static void main(String[] args) {
        int num = 8;
        int first =0;
        int second = 1;
        System.out.print("Fibonacci Series : ");
        for(int i = 1; i <= num ; i++){
            System.out.print(first+" ");
            int third=first + second;
            first = second;
            second = third;
        }
    }
}
