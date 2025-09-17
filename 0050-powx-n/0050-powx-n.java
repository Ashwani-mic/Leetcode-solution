class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        
        if (n < 0) {
            
            if (n == Integer.MIN_VALUE) {
                return (1 / x) * myPow(1 / x, -(n + 1));
            }
            return 1 / myPow(x, -n);
        }

        
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x, n - 1);
        }
    }
}

