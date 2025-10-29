class Solution {
    public int smallestNumber(int n) {
        String res=Integer.toBinaryString(n);
        String ans=res.replaceAll("0","1");
        return Integer.parseInt(ans,2);
    }
}