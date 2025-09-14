class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char ch:text.toCharArray()){
            switch(ch){
                case 'b':b++;break;
                case 'a':a++;break;
                case 'l':l++;break;
                case 'o':o++;break;
                case 'n':n++;break;
                default: break;
            }
        }
        l=l/2;
        o=o/2;
        return Math.min(Math.min(b,a),Math.min(l,Math.min(o,n)));
    }
}