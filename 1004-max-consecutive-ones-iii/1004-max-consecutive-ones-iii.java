class Solution {
    public int longestOnes(int[] nums, int k) {
        int flip = 0;
        int left =0;
       
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                flip++;
                
            }
            while(flip >k){
                
                if(nums[left]==0){
                    flip--;
                }
                left++;


            }
            ans  = Math.max(i-left+1,ans);
        }
        return ans;

        
    }
}