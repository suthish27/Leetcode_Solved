class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer>set=new HashSet<>();
        for(int num:friends){
            set.add(num);
        }
        int k=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                friends[k++]=order[i];
            }
        }
        return friends;
    }
}