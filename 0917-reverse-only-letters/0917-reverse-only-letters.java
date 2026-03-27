class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder t=new StringBuilder(s).reverse();
        String temp=t.toString();

        ArrayList<Character>arr=new ArrayList<>();
        for(char ch:temp.toCharArray()){
            if(Character.isLetter(ch)){
                arr.add(ch);
            }
        }
        String res="";
        int k=0;
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
            res+=arr.get(k);
            k++;
        }else{
            res+=ch;
        }
        }return res;
    }
    }