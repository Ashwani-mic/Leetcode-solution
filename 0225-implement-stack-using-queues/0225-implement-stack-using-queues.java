class MyStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q2.add(x);
        while(!q.isEmpty()){
            q2.add(q.remove());
        }
        Queue<Integer> temp = q;
        q =q2;
        q2 =temp;
        
    }
    
    public int pop() {
        return q.remove();

        
    }
    
    public int top() {
        return q.peek();
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */