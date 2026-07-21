class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qu = new LinkedList<>();
        
        int n = students.length;
        for(int i = 0 ;i<n;i++){
           
            qu.offer(students[i]);
        }
        int count  = 0;
        int i =0;
        while(!qu.isEmpty() && count<qu.size()){
            if(qu.peek() ==sandwiches[i]){
                qu.poll();
                
                count=0;
                i++;
            }
            else{
                int x = qu.poll();
                qu.offer(x);
                count++;
            }
            
        }
        return qu.size();
    
        
    }
}