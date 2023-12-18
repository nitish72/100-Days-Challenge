//https://leetcode.com/problems/spiral-matrix-ii/ 
//Date: 14 Dec 2023
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int count =1;
        int minRow=0;
        int maxRow=n-1;
        int minCol=0;
        int maxCol=n-1;
//Beacuse the matrix is square 
        while(count<=n*n)
        {
          //minRow is fixed and go minCol to maxCol
          for(int col=minCol; col<=maxCol; col++){
             arr[minRow][col] = count;
             count++;
          }
          //maxCol is fixed and go minRow+1 to maxRow
          for(int row=minRow+1; row<=maxRow; row++){
              arr[row][maxCol]=count;
              count++;
          }
          //maxRow is fixed and go maxCol-1 to minCol
          for(int col=maxCol-1; col>=minCol; col--){
              arr[maxRow][col]=count;
              count++;
          }
          //minCol fixed maxRow-1 to minRow+1
          for(int row=maxRow-1;row>=minRow+1; row--){
              arr[row][minCol]=count;
              count++;
          }
//Here we have to srink the matrix 
          minCol++;
          maxCol--;
          minRow++;
          maxRow--;
        }
       return arr; 
    }
}
