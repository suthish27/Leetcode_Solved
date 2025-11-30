class Solution {
    public String finalString(String s) {
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='i'){
                res.append(ch);
            }else{
                res.reverse();
            }
        }
        return res.toString();
    }
}