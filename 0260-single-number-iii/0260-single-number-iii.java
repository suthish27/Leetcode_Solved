class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        Set<Integer>set=new HashSet<>();
        for(int ab:nums){
            if(set.contains(ab)){
                set.remove(ab);
            }else{
                set.add(ab);
            }
        }
        int arr[]=new int[set.size()];
        int k=0;
        for(int ab:set){
            arr[k++]=ab;
        }
        return arr;
    }
}