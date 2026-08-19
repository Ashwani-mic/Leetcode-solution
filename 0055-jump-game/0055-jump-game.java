class Solution {
    public boolean jump(int[]nums , int i , Boolean[] dp){
        if(i>=nums.length-1)return true;
        if(dp[i] != null)return dp[i];
        int maxjump = nums[i];
        for(int j=1;j<=maxjump;j++){
            if(jump(nums,i+j,dp)){
                return dp[i]=true;
            }
        }
        return dp[i] = false;
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean[] dp = new  Boolean[n];
       
        return jump(nums,0,dp);
        
    }
}