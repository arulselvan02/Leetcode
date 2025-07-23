class Solution {
    public int integerReplacement(int n) {
        int cnt = 0;
        long num = n;
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                if ((num & 2) == 2 && num != 3) {
                    num++;
                } else {
                    num--;
                }
            }
            cnt++;
        }
        return cnt;
    }
}