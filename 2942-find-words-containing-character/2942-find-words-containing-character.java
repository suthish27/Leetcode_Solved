class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        StringBuilder s=new StringBuilder();
        s.append(x);
        s.toString();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(s)){
                arr.add(i);
            }
        }return arr;
    }
}