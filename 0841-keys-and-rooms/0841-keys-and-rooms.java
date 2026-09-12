class Solution {
    public void bfs(int i , List<List<Integer>> rooms , boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while(q.size()>0){
            int front = q.remove();
            for(int ele: rooms.get(front)){
                if(vis[ele] == false ){
                    q.add(ele);
                    vis[ele] = true;
                } 
            }
        }


    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0] = true;
        bfs(0,rooms,vis);
        for(int j=0;j<n;j++){
            if(vis[j] == false)return false;
        }
        return true;
        
    }
}