class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        long temp=1;
        while(temp<n){
            temp*=2;
            if(n==temp){
                return true;
            }
        }
        return false;
    }
}