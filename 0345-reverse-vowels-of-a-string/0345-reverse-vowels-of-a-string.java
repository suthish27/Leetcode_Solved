class Solution {
    public String reverseVowels(String s) {
        StringBuilder temp=new StringBuilder(s).reverse();
            String t=temp.toString();
            ArrayList<Character>arr=new ArrayList<>();
            for(char ch:t.toCharArray()){
                if("aeiouAEIOU".indexOf(ch)!= -1){
                    arr.add(ch);
                }
            }
            String res="";
            int i=0;
            for(char ch:s.toCharArray()){
                if("aeiouAEIOU".indexOf(ch) != -1){
                    res+=arr.get(i);
                    i++;
                }else{
                    res+=ch;
                }
            }return res;
    }
}