class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
         int temp=x;
         int sum;
        int d1,d2,d3;
        if(x<=99){
        d1=temp%10;
        temp/=10;
        d2=temp%10;
        sum=d1+d2;
        if(x%sum==0)
    return sum;
    }
        else if(x>=100){
        // int d1,d2,d3;
        d1=temp%10;
        temp/=10;
        d2=temp%10;
        temp/=10;
        d3=temp%10;
        sum=d1+d2+d3;
        if(x%sum==0)
        return sum;
        }
        return -1;
    }
}