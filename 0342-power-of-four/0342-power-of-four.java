class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;

        long temp=1;
        while(temp<n){
            temp*=4;

            if(n==temp){
                return true;
            }
        }
        return false;
    }
}