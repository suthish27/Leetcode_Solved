class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer>s1=new HashSet<>();
        for(int ab:nums){
            if(!s1.contains(ab))
            s1.add(ab);
            else
        return ab;
        }
        return 0;
    }
}