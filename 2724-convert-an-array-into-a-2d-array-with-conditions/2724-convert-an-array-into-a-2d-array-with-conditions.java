class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       List<List<Integer>>res=new ArrayList<>(); 
       ArrayList<Integer>list1=new ArrayList<>();
       boolean b=true;
       list1.add(nums[0]);
       res.add(list1);
       for(int i=1;i<nums.length;i++){
        b=true;
        for(List<Integer>k:res){
            if(!k.contains(nums[i])){
                k.add(nums[i]);
              b=false;
                break;
            }
        }
        if(b){
    ArrayList<Integer> m=new ArrayList<>();
    m.add(nums[i]);
       
       res.add(m);}}
return res;
}
}