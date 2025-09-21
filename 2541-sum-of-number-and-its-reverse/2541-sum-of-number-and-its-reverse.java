class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0)return true;
        for(int i=0;i<num;i++){
            String str=Integer.toString(i);
            String rev=new StringBuilder(str).reverse().toString();
            int a=Integer.parseInt(str);
            int b=Integer.parseInt(rev);
            if(a+b==num)return true;
        }
        return false;
    }
}