package Heap;

public class 239. Sliding Window Maximum {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(nums[b]-nums[a]));
            int []ans=new int[nums.length-k+1];
            int index=0;
            for(int i=0;i<nums.length;++i){
                while(!pq.isEmpty() && pq.peek()<=i-k){
                    pq.poll();
                }
                pq.add(i);
                if(i>=k-1){
                    ans[index++]=nums[pq.peek()];
                }
            }
            return ans;
        }
    }
}
