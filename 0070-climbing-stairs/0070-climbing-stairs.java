class Solution {
    

    public int ways(int n , int[] dp,int i){
        if(i==n) return 1;
        if(i >n) return 0;

        if(dp[i] != -1) return dp[i];
        return dp[i] = ways(n,dp,i+1) +ways(n,dp,i+2);

    }
    public int climbStairs(int n) {
        
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return ways(n,dp,0);


        
    }
}