
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int res = numBottles;

        while(numBottles>=numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            res = res + newBottles;
            numBottles = newBottles + remBottles;
        }
        return res;
    }
}
