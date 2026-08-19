class Solution {
    public int minjumps(int[] nums , int i , int[] dp){
        if(i >=nums.length-1) return 0;
        if(dp[i] != -1)return dp[i];
        int max = nums[i];
        int min = Integer.MAX_VALUE;
        for(int j = 1 ;j<=max ;j++){
            int jump = minjumps(nums,i+j,dp);
            if(jump !=Integer.MAX_VALUE){
                min = Math.min(min,1+jump);
            }
        }
        return dp[i] = min;
    }
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return minjumps(nums,0,dp);
        
    }
}