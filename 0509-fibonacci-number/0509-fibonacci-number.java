class Solution {
    public int fib(int n) {
       if(n<=1)return n;
       int[] dp = new int[n+1];
       if(dp[n] !=0)return dp[n];
       int ans = fib(n-1)+fib(n-2);
       dp[n] = ans;
       return dp[n];
    }
}