class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)return 0;
        Arrays.sort(nums);
        int maxgap=0;
        for(int i=1;i<nums.length;i++){
            maxgap=Math.max(maxgap,nums[i]-nums[i-1]);
        }
        return maxgap;
    }
}