class Solution {
    public int helper(List<Integer>nums,int target , int i , int[][]dp){
        if(target == 0)return 0;
        if(i >= nums.size())return -1;
        if(dp[i][target] !=-2)return dp[i][target];
        int take = -1;
        if(target >=nums.get(i)){
            int result = helper(nums,target-nums.get(i),i+1,dp);
            if(result !=-1){
                take = 1+result;
            }

        }
        
        int skip = helper(nums,target,i+1,dp);
        return dp[i][target] = Math.max(take,skip);

    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target+1];
        for(int[] row:dp){
             Arrays.fill(row,-2);
        }
        return helper(nums,target,0,dp);
        
        
    }
}