class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        if(x<0)
        return false;
        int palindrome=0;
        while(x>0){
        int slice=x%10;
        palindrome=(palindrome*10)+slice;
        x/=10;
        }
        if(palindrome==temp)
        return true;

        return false;
    }
}