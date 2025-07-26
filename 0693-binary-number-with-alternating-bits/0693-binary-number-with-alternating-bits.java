class Solution {
    public boolean hasAlternatingBits(int n) {
       int last = n%2;
       n/=2;
       while(n>0){
        int val = n%2;
        n/=2;
        if(val==last){
            return false;
        }
        last=val;
       } 
       return true;
    }
}