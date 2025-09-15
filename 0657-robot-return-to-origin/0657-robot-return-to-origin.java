class Solution {
    public boolean judgeCircle(String moves) {
        int h=0;
        int v=0;
        for(char ab:moves.toCharArray()){
            if(ab=='U')v++;
            else if(ab=='D')v--;
            else if(ab=='L')h++;
            else if(ab=='R')h--;
        }
        return h==0&&v==0;

    }
}