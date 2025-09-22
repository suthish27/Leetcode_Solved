class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] fre=new int[101];
        int m=0;
        for(int i:nums){
            fre[i]++;
            m=Math.max(m,fre[i]);
        }
        int a=0;
        for(int i:fre){
            if(i==m)a+=i;
        }
        return a;
    }
}