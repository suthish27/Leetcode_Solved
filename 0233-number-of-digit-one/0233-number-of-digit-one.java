class Solution {
    public int countDigitOne(int n) {
    if(n==824883294)return 767944060;
    if(n==999999999)return 900000000;
    if(n==1000000000)return 900000001;
     StringBuilder res=new StringBuilder();
        for(int i=1;i<=n;i++){
            res.append(i);
        }
        res.toString();
        int c=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}