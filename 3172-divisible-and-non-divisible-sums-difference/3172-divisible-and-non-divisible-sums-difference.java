class Solution {
    public int differenceOfSums(int n, int m) {
     int yes=0;
     int no=0;
       for(int i=1;i<=n;i++){
        if(i%m==0){
            yes+=i;
        }else{
            no+=i;
        }
       } 
    return no-yes;
}
}