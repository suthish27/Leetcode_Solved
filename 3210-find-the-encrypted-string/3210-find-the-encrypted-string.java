class Solution {
    public String getEncryptedString(String s, int k) {
        ArrayList<Character>arr=new ArrayList<>();
        for(char ch:s.toCharArray()){
            arr.add(ch);
        }
        Collections.rotate(arr,-k);
        StringBuilder res=new StringBuilder();
        for(char ab:arr){
            res.append(ab);
        }
        return res.toString();
    }
}