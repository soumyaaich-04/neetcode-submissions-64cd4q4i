class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()==t.length()){
            char sarr[]=s.toCharArray();
            char tarr[]=t.toCharArray();
            Arrays.sort(sarr);
            Arrays.sort(tarr);
            for(int i=0;i<sarr.length;i++){
                if(sarr[i]!=tarr[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
