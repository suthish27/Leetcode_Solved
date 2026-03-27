class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        StringBuilder res=new StringBuilder();
        for(char ch:bin.toCharArray()){
            if(ch=='0'){
                res.append('1');
            }else{
                res.append('0');
            }
        }return Integer.parseInt(res.toString(),2);
    }
}