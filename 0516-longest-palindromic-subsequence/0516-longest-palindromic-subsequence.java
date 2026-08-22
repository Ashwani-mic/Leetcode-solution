class Solution {
    public int helper(StringBuilder a  ,StringBuilder b , int i  , int j , int[][] dp ){
        if( i <0 || j<0 ) return 0;
        if(dp[i][j] !=-1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)){
            dp[i][j] = 1 + helper(a , b , i-1,j-1,dp);
        }
        else{
            dp[i][j] = Math.max(helper(a , b , i , j-1,dp),helper(a ,b,i-1 , j,dp));
        }
        return dp[i][j];

    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i =0 ;i<n;i++){
            for(int j = 0 ;j<n;j++){
                dp[i][j] = -1;
            }
        }
        String reverse = new StringBuilder(s).reverse().toString();
        StringBuilder a = new StringBuilder(s);
        StringBuilder b  = new StringBuilder(reverse);
        return helper( a , b ,n-1,n-1,dp);
        
    }
}