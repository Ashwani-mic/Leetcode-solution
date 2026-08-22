class Solution {
    public int helper(StringBuilder a , StringBuilder b , int i , int j , int[][]dp){
        if(i < 0 || j<0) return 0;
        if(dp[i][j] != -1 ) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)){
            dp[i][j] = 1+helper(a , b , i-1 , j-1 , dp);
        }
        else{
            dp[i][j] = Math.max(helper(a, b , i ,j-1 , dp ) , helper(a , b , i-1 , j ,dp));
        }
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                dp[i][j] = -1;
            }
        }
        StringBuilder a  = new StringBuilder(word1);
        StringBuilder b = new StringBuilder(word2);
        int x = helper(a , b , n-1 , m-1 , dp);
        int result = (n-x) +(m-x);
        return result;

        
    }
}