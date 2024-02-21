class MinStack {

    public MinStack() {
        
         }
    
    Stack<Integer> st = new Stack<Integer>();
         Stack<Integer> st2 = new Stack<Integer>();

    public void push(int val) {
        
         
        
        st.push(val);
        
        if(st2.isEmpty()|| (val<=st2.peek()))
          st2.push(val);
        
    }
    
    public void pop() {

        int a= st.peek();
        int b=st2.peek();
        if(a==b)
           st2.pop();
        st.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        
        int z = 0;
        if(!st2.isEmpty())
           z=st2.peek();
        else 
           z=st.peek();
           
        return z;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */