class Solution {
    public boolean helper(int[]nums, int i , Boolean[][]dp , int x ){
        if(x==0)return true;
        if(x<0 || i>=nums.length) return false;
        if(dp[i][x] !=null) return dp[i][x];
        Boolean  take = helper(nums,i+1,dp,x-nums[i]);
        Boolean skip = helper(nums,i+1,dp,x);
        return dp[i][x] = take || skip; 
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if(n==0)return false;
        int sum = 0 ; 
        for(int i=0;i<n;i++){
            sum += nums[i];

        }
        if(sum % 2 != 0 )return false;
        int x = sum/2;
        Boolean[][] dp = new Boolean[n][x+1];
        return helper(nums,0,dp,x);
        
        
    }
}