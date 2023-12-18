//https://leetcode.com/problems/matrix-diagonal-sum/
//Date : 12 Dec 2023
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;    // To store the um of diagonal in the Matrix
        int n = mat.length; //Store the length of the matrix in a variable 
//We found that a pattern in the diagonal that is i==j or i+j==n-1;
        for(int i=0; i < n; i++) {
            for(int j=0; j < n; j++) {
            if(i==j || i+j==n-1) {
                sum = sum + mat[i][j];
                }
            } 
            
        }
        return sum;
        
    }
}
