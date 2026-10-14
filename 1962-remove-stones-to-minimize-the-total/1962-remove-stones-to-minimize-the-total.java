class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for(int i = 0;i<piles.length;i++){
            pq.add(piles[i]);
        }
        while(k>0){
            int stone = pq.remove();
            int n = stone/2;
            int l = stone - n;
            pq.add(l);
            k--;
        }
        while(!pq.isEmpty()){
            sum +=pq.remove();
        }
        return sum ;
        
    }
}