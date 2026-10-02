class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left  = 0 ;
        int right = 0;
        int sum = 0;
        int count = 0;
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
            count++;
            while(sum >= target){
                ans = Math.min(count,ans);
                sum -=nums[left];
                count--;
                left++;


            }
            

        }
        
            

        
      return ans == Integer.MAX_VALUE ?0:ans;
        
    }
}