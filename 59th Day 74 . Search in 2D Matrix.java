https://leetcode.com/problems/search-a-2d-matrix/ Data- 15/12/2023

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          for(int i=0; i<matrix.length; i++) {
          for(int j=0; j<matrix[i].length; j++) {
              if(matrix[i][j]==target) {
                  return true;
              }
           }
        }
        return false;
    }
}
