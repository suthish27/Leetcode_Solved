class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        String b="";
        for(int i=0;i<word1.length;i++){
            a+=word1[i];
        }
        for(int j=0;j<word2.length;j++){
            b+=word2[j];
        }
        return a.equals(b);
    }
}