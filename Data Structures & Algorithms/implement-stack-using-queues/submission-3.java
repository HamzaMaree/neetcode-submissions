class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        for(int i = 0 ; i < queue.size() ; i++){
            Integer y = queue.poll();
            if(y == null){
                queue.offer(x);
            }else{
                queue.offer(y);
            }
        }

        if(queue.size() == 0){
            queue.offer(x);
        }

        queue.offer(null);
    


    }
    
    public int pop() {
        Integer y = -1;
        if(!queue.isEmpty()){
            int counter = queue.size()-1;
            for(int i = 0 ; i < queue.size()-1 ; i++){
                if((counter-1) == i){
                    y = queue.poll();
                    Integer z = queue.poll();
                    if(queue.size() != 0){
                        queue.offer(z);
                    }
                }else{
                    queue.offer(queue.poll());
                }
            }
        }
        return y;
    }
    
    public int top() {
        Integer y = -1;
        if(!queue.isEmpty()){
            int counter = queue.size()-1;
            for(int i = 0 ; i < queue.size()-1 ; i++){
                if((counter-1) == i){
                    y = queue.poll();
                    Integer z = queue.poll();
                    queue.offer(y);
                    queue.offer(z);
                    
                }else{
                    queue.offer(queue.poll());
                }
            }
        }
        return y;
    }
    
    public boolean empty() {
        return queue.isEmpty();
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