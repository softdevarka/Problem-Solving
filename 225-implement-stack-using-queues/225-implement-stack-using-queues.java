class MyStack {
    ArrayDeque<Integer> q;
    public MyStack() {
        q=new ArrayDeque<>();        
    }
    public void push(int x) {
        q.push(x);        
    }
    
    public int pop() {
        return q.remove();
    }
    public int top() {
        return q.peekFirst();
    }
    public boolean empty() {
        return q.isEmpty(); 
    }
}