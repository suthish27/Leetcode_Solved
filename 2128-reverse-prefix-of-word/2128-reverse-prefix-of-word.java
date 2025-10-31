class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
        String ab="";
        for(int i=n;i>=0;i--){
            ab+=word.charAt(i);
        }
        for(int i=n+1;i<word.length();i++){
            ab+=word.charAt(i);
        }
        return ab;
    }
}