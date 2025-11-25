class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int num:nums)set.add(num);
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}