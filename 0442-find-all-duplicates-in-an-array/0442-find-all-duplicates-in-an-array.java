class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>res=new ArrayList<>();
        Set<Integer>seen=new HashSet<>();

        for(int num:nums){
            if(seen.contains(num)){
                res.add(num);
            }else{
                seen.add(num);
            }
        }
        return res;
    }
}