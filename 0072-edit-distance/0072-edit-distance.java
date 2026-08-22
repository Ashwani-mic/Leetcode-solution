class Solution {
    public int minStep(StringBuilder a , StringBuilder b , int i , int j , int[][]dp){
        if(i == -1 )return j+1;
        if(j==-1 ) return i+1;
        if(dp[i][j] != -1 )return dp[i][j];
        if(a.charAt(i)==b.charAt(j)){
            dp[i][j] = minStep(a , b , i-1 , j-1 ,dp);
        }
        else{
            int delete = minStep(a , b, i-1 , j,dp);
            int insert = minStep(a , b , i ,j-1 ,dp);
            int replace = minStep(a , b, i-1,j-1 , dp);
            dp[i][j] = 1 + Math.min(delete , Math.min(insert,replace));
        }
        return dp[i][j];
        
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][]dp = new int[n][m];
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                dp[i][j] =-1;
            }
        }
        StringBuilder a = new StringBuilder(word1);
        StringBuilder b = new StringBuilder(word2);
        return minStep(a , b , n-1 , m-1 , dp);
        
    }
}