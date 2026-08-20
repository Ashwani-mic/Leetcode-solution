class Solution {
    public int helper(StringBuilder a , StringBuilder b , int i , int j ,int[][]dp){
        if(i < 0 || j <0)return 0;
        if(dp[i][j] != -1 )return dp[i][j];
        if(a.charAt(i) == b.charAt(j)){
            dp[i][j] = 1+helper(a,b,i-1,j-1,dp);
        }
        else{
            dp[i][j] = Math.max(helper(a,b,i-1,j,dp),helper(a,b,i,j-1,dp));
        }
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder a = new StringBuilder(text1);
        StringBuilder b = new StringBuilder(text2);
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[a.length()][b.length()];
        for(int i = 0 ;i<text1.length();i++){
            for(int j = 0 ;j<text2.length();j++){
                dp[i][j] = -1;
            }
        }
        return helper(a,b,n-1,m-1,dp);
        
    }
}