class Solution {
    public void bfs(int i , int[][] isConnected , boolean[]vis){
        Queue<Integer> q  = new LinkedList<>();
        vis[i] =true;
        q.add(i);
       while(q.size()>0){
            int first = q.remove();
            for(int j =0;j<isConnected.length;j++){
                if(vis[j]==false && isConnected[first][j]==1){
                q.add(j);
                vis[j] =true;
                }
            
            }

        }
    }





    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i = 0 ;i<n;i++){
            if(vis[i]==false){
                bfs(i , isConnected , vis);
                count++;
            }
           
        }
        return count;
        
    }
}