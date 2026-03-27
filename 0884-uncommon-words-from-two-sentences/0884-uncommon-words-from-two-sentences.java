class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String ab=s1+" "+s2;
        String arr[]=ab.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(String ac:arr){
            map.put(ac,map.getOrDefault(ac,0)+1);
        }
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                a.add(arr[i]);
            }
        }
        String fin[] = new String[a.size()];
        int k=0;
        for(int i=0;i<a.size();i++){
            fin[k++]=a.get(i);
        }
        return fin;
   }
}