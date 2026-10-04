class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int k = 0;
        int[] taken = new int[fruits.length+1];

       
        int ans = 0;
        
        for(int i =0;i<fruits.length;i++){
            if(taken[fruits[i]]==0){
                k++;
            }
            taken[fruits[i]]++;
            while(k>2){
                taken[fruits[left]]--;
                if(taken[fruits[left]]==0){
                    k--;
                }
                left++;
            }
            ans = Math.max(ans , i-left+1);
            
         
        }
        return ans;
        
    }
}