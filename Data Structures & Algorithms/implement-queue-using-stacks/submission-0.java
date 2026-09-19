class MyQueue {
    Stack<Integer>stack1;
    Stack<Integer>stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
        stack2.clear();
        ListIterator<Integer>listIterator = stack1.listIterator(stack1.size());
        while(listIterator.hasPrevious()) {
            stack2.push(listIterator.previous());
        }
    }
    
    public int pop() {
        int value = stack2.pop();
        stack1.clear();
        ListIterator<Integer>listIterator = stack2.listIterator(stack2.size());
        while(listIterator.hasPrevious()) {
            stack1.push(listIterator.previous());
        }
        return value;
    }
    
    public int peek() {
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack2.isEmpty() || stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */