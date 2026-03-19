class Solution {
    public int firstUniqueEven(int[] nums) {
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ab:nums){
            if(ab%2==0){
            map.put(ab,map.getOrDefault(ab,0)+1);
            }
        }
        for(int a:nums){
            if(a%2==0 && map.get(a)==1){
                return a;
            }
        }return -1;
    }
}