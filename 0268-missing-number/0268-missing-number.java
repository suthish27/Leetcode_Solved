class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int e=n*(n+1)/2;
        int sum=0;
        for(int m:nums){
            sum+=m;
        }
        return e-sum;
    }
}