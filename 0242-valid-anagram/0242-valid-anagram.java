// import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char ch[]=s.toCharArray();
        char dh[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(dh);
    return Arrays.equals(ch,dh);
    
    }
    // public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     Solution ob=new Solution();
    //     String s=sc.nextLine();
    //     String t=sc.nextLine();
    //     System.out.println(ob.isAnagram(s,t));
    // }
}