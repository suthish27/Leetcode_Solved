import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger decA = new BigInteger(a, 2);
        BigInteger decB = new BigInteger(b, 2);
        BigInteger sum = decA.add(decB);
        return sum.toString(2);
    }
}