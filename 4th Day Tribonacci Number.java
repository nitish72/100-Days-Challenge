
class Solution {
    public int tribonacci(int n) {
        if(n== 0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }
        int num1= 0;
        int num2=1;
        int num3=1;
        for(int i = 1; i<=n; i++){
        
        int num4 = num1 + num2 + num3;
          num1=num2;
          num2=num3;
          num3=num4;

        }
        return num1;
        
    }
}
