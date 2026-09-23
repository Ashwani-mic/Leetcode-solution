class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
       
        for(int i = 0;i<n;i++){
            ans[i]=-1;
            for(int j = 0;j<nums2.length;j++){
                if(nums2[j] ==nums1[i]){
                    int k = j+1;
                    
                    while(k<nums2.length){
                        if(nums2[k] > nums1[i] ){
                            ans[i]=nums2[k];
                            
                            break;
                        }
                        k++;

                    }
                    break;
                }
            }
        }
        return ans;
        
    }
}