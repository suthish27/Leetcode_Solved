class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int m=prices[0];
        int max=0;
        for(int i=1;i<n;i++){
            int c=prices[i]-m;
            max=Math.max(max,c);
            m=Math.min(m,prices[i]);
        }
        return max;
    }
}