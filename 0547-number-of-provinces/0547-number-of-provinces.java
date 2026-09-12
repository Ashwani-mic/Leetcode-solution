class Solution {
    public void bfs(int i , int[][] isConnected , boolean[] visited){
        int m = isConnected.length;
        visited[i] =true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            
            int front = q.remove();
            for(int j = 0;j<m;j++){
                if(visited[j] !=true && isConnected[front][j]==1){
                    q.add(j);
                    visited[j] =true;
                    


                }
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0 ;
        boolean[] visited = new boolean[n];
        for(int i = 0;i<n;i++){
            if(!visited[i]){
            bfs(i,isConnected , visited);
            count++;
            }
        }
        return count;
        
        
    }
}