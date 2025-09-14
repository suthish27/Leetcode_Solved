class Solution {
    public boolean stoneGame(int[] piles) {
        for(int i=0;i<piles.length;i++){
            for(int j=1;j<piles.length;j++){
                if(piles[i]==piles[j]&&i!=j)
                return true;
            }
        }int count=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%2!=0)
            count++;
        }
        if(count>=1)return true;


        return false;
    }
}