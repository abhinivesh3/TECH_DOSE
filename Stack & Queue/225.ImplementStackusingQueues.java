package Stack & Queue;

public class 225.ImplementStackusingQueues {
    class MyStack {
        Queue<Integer> queue;
    
        public MyStack() {
            this.queue=new LinkedList<Integer>();
        }
        
        public void push(int x) {
            queue.add(x);
            for(int i=1;i<queue.size();i++){
                queue.add(queue.poll());
            }
        }
        
        public int pop() {
            return queue.poll();
        }
        
        public int top() {
            return queue.peek();
        }
        
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
