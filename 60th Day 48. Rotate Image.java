package com.TwoD_Array;
//https://leetcode.com/problems/rotate-image/description/ //16/12/2023
public class Rotate_Image_2D_Matrix {
        public void rotateMatrix(int[][] matrix) {
            // take a variable to store the length of Matrix
            int n = matrix.length;

            //Loops
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int k = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = k;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                int[] temArr = matrix[i];
                reverseMatrix(temArr);
            }
            return;
        }

        //Reverse a Matrix
        public void reverseMatrix(int[] arr){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    public static void main(String[] args) {
      int[][] matrix= {  {1, 2, 3 },
                         {4, 5, 6 },
                         {7, 8, 9 }   };
      //Before
        System.out.println("Before Rotate 2D Matrix :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Rotate_Image_2D_Matrix obj = new Rotate_Image_2D_Matrix();
        obj.rotateMatrix(matrix);
        System.out.println("After Rotate :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
