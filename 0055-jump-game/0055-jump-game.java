class Solution {
    public boolean jump(int[] nums, int i , Boolean[]dp){
        if(i>=nums.length-1)return true;
        if(dp[i] !=null) return dp[i];
        int max = nums[i];
        for(int j = 1 ;j<=nums[i];j++){
            if(jump(nums,i+j,dp)){
                dp[i] = true;
                return true;
            }
        }
        dp[i] = false;
        return false;
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean[] dp = new Boolean[n];
        
        return jump(nums, 0 , dp);
        
    }
}