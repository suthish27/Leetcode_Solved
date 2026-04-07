class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
       ArrayList<Integer>arr=new ArrayList<>();
       for(int ab:nums){
        arr.add(ab);
       }
       int f=Collections.max(arr);
       arr.remove(Collections.max(arr));
       int s=Collections.max(arr);
       int t=Collections.min(arr);
       int res=f+s-t;
       return res;
    }
}