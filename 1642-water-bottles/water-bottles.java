class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total_bottle = numBottles;
        while(numBottles >= numExchange)
        {
            total_bottle+= numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return total_bottle;
    }
}