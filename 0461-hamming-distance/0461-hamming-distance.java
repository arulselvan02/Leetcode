class Solution {
    public int hammingDistance(int x, int y) {
        int res = x^y;
        int c=0;

        while(res>0){
            int v=res%2;
            c+=v;
            res/=2;
        }
        return c;
    }
}