class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(indices[i],s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            res.append(map.get(i));
        }
        return res.toString();
    }
}