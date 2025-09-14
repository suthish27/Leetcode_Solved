class Solution {
    public boolean isPerfectSquare(int num) {
        long res=1;
        for(long i=1;i<=num;i++){
           if(i*i==num){
            return true;
           }
           }
        return false;
    }
}