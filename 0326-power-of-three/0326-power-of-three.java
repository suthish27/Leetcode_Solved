class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)return true;

        long temp=1;
        while(temp<n){
            temp*=3;
            if(temp==n){
                return true;
            }
        }
        return false;
    }
}