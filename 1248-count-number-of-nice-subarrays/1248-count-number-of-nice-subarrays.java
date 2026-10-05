class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int oddcount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==1){
                oddcount++;
            }
            int pre = oddcount-k;
            if(map.containsKey(pre)){
                count +=map.get(pre);
            }
            map.put(oddcount,map.getOrDefault(oddcount,0)+1);
        }
        return count;
        
    }
}