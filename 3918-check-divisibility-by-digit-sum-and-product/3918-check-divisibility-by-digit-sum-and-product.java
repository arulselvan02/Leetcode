class Solution {
    public boolean checkDivisibility(int n) {
        if (n == 0) {
            return false; // Division by zero would occur
        }
        
        int sum = 0;
        int pro = 1;
        int d = n;
        
        // Extract and process each digit without a loop
        int d1 = d % 10; d /= 10; sum += d1; pro *= d1;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d2 = d % 10; d /= 10; sum += d2; pro *= d2;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d3 = d % 10; d /= 10; sum += d3; pro *= d3;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d4 = d % 10; d /= 10; sum += d4; pro *= d4;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d5 = d % 10; d /= 10; sum += d5; pro *= d5;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d6 = d % 10; d /= 10; sum += d6; pro *= d6;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d7 = d % 10; d /= 10; sum += d7; pro *= d7;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d8 = d % 10; d /= 10; sum += d8; pro *= d8;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d9 = d % 10; d /= 10; sum += d9; pro *= d9;
        if (d == 0) return (sum + pro) != 0 && n % (sum + pro) == 0;
        
        int d10 = d % 10; sum += d10; pro *= d10;
        
        int z = sum + pro;
        return z != 0 && n % z == 0;
    }
}