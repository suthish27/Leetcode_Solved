class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ab:nums){
            map.put(ab,map.getOrDefault(ab,0)+1);
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}