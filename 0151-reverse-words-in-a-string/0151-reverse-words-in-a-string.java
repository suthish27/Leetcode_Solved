class Solution {
    public String reverseWords(String s) {
        String result=s.trim();
        StringBuilder res=new StringBuilder();
        String arr[]=result.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            res.append(arr[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}