class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1;
        int d=n;
        while(d>0)
        {
            int r=d%10;
            sum+=r;
            pro*=r;
            d=d/10;
        }
        int z=sum+pro;
        if(n%z==0)
        {
            return true;
        }
        return false;
    }
}