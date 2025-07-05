class Solution {
    public int findLucky(int[] arr) {
        int fre[]=new int[501];
        for(int i: arr){
            fre[i]++;
        }
        for(int i = fre.length-1;i>0;i--){
            if(i == fre[i]) return i;
        }
        return -1;
    }
}