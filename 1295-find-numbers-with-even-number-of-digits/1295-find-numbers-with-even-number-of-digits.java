class Solution {
    public int findNumbers(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int ab:nums){
            int len=String.valueOf(ab).length();
            arr.add(len);
            }
            int c=0;
            for(int ac:arr){
                if(ac%2==0){
                    c++;
                }
            }
        return c;
    }
}