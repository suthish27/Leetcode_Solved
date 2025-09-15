class Solution {
    public int addDigits(int num) {
        int res=0;
        if(num==0)return 0;
        else if(num%9==0)return 9;
        else res=num%9;

        return res;
    }
}