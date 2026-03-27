class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length()/2;
        String a="";
        for(int i=0;i<n;i++){
            a+=s.charAt(i);
        }
        String b="";
        for(int i=n;i<=s.length()-1;i++){
            b+=s.charAt(i);
        }
        int c=0,c1=0;
        for(char ch:a.toCharArray()){
            if("aeiouAEIUOU".indexOf(ch) != -1){
                c++;
            }
        }for(char ch:b.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                c1++;
            }
        }
        return c==c1;
    }
}