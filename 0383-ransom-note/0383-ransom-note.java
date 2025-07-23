class Solution {
    public boolean canConstruct(String r, String m) {
        int[] ab =new int[26];
    
        for(char i:m.toCharArray()){
            ab[i-'a']++;
        }
        for(char i:r.toCharArray()){
            if(--ab[i-'a']<0) return false;
        }
        return true;
    }
}