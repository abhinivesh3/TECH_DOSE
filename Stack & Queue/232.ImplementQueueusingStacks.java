package Stack & Queue;

public class 232.ImplementQueueusingStacks {
    class MyQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        private int front;
        public MyQueue() {
            stack1=new Stack();
            stack2=new Stack();
        }
        
        public void push(int x) {
            if(stack1.isEmpty())front=x;
            stack1.push(x);
        }
        
        public int pop() {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int ans=0;
            if(!stack2.isEmpty()){
                ans=stack2.pop();
            }
            front=stack2.isEmpty()?-1:stack2.peek();
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return ans;
        }
        
        public int peek() {
            return front;
        }
        
        public boolean empty() {
            return stack1.isEmpty();
        }
    }
}
