class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;
        if(n==1)return stones[0];
        for(int i = 0;i<n;i++){
            pq.add(stones[i]);
        }
        while(pq.size() >1 ){
            int high = pq.remove();
            int low = pq.remove();
            if(high ==low) continue;
            pq.add(high - low);
            

        }
        return  pq.peek()==null ?0:pq.peek();
        
    }
}