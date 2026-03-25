class Solution {
    public int maximumCount(int[] nums) {
  
        int pos=0,neg=0;
        for(int ab:nums){
            if(ab<=-1){
                neg++;
            }else if(ab>=1){
                pos++;
            }
        }
        return Math.max(pos,neg);
    }
}