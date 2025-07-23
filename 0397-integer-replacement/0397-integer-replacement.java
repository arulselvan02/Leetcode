class Solution {
    public int integerReplacement(int n) {
        return helper((long) n, 0);
    }

    private int helper(long n, int c) {
        if (n == 1) return c;
        if (n % 2 == 0)
            return helper(n / 2, c + 1);
        else
            return Math.min(helper(n + 1, c + 1), helper(n - 1, c + 1));
    }
}
