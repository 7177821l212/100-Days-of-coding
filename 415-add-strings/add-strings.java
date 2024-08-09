import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        // long num3 = Integer.parseInt(num1);
        // long num4 = Integer.parseInt(num2);
        BigInteger  big1 = new BigInteger (num1);
        BigInteger  big2 = new BigInteger (num2);
        BigInteger result = big1.add(big2);
        return result.toString();
    }
}