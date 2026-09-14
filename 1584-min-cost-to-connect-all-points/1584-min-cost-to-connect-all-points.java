class Solution {
    public class Triplet implements Comparable<Triplet>{
        int node;
        int parent ;
        int dis;
        Triplet(int node , int parent , int dis){
            this.node = node;
            this.parent = parent;
            this.dis = dis;
        }
        public int compareTo(Triplet t){
            if(this.dis ==t.dis) return Integer.compare(this.node , t.node);
            return Integer.compare(this.dis,t.dis);
        }
    }
    






    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int sum = 0;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[n];
        pq.add(new Triplet(0,-1,0));
        while(pq.size()>0){
            Triplet first  = pq.remove();
            int node = first.node; int parent = first.parent ; int dis = first.dis;
            if(vis[node]==true)continue;
            vis[node] = true;
            sum +=dis;
            for(int i = 0;i<n;i++){
                if(i==node || i==parent) continue;
                if(vis[i]==true) continue;
                int x = points[node][0] ; int y = points[node][1];
                int x2 = points[i][0] ; int y2 = points[i][1];
                int mandis = Math.abs(x2-x) + Math.abs(y2-y);
                pq.add(new Triplet(i,node,mandis));
            }

        }
        return sum ;
        
    }
}