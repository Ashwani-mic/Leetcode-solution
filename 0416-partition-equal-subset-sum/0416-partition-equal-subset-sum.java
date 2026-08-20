class Solution {
    public boolean helper(int[]nums , int i , Boolean[][]dp , int x){
        if(x == 0 )return true;
        if(x <0 || i >=nums.length)return false;
        if(dp[i][x] != null)return dp[i][x];
        boolean take  = helper(nums,i+1,dp,x-nums[i]);
        boolean skip = helper(nums,i+1,dp,x);
        return dp[i][x]=take || skip;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0 ;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum %2 != 0){
            return false;
        }
        
        int x = sum/2;
        Boolean[][] dp = new Boolean[nums.length+1][x+1];
       
        return helper(nums , 0 , dp,x);

        
        
    }
}