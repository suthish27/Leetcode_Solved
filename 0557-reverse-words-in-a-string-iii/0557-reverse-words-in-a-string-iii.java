class Solution {
    public String reverseWords(String s) {
        StringBuilder r=new StringBuilder(s);
        r.reverse();
        String rev=r.toString();
        String arr[]=rev.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            ans.append(arr[i]).append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}