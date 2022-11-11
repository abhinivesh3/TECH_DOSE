package Heap;

public class 295. Find Median from Data Stream {
    class MedianFinder {
        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
        public MedianFinder() {
            
        }
        
        public void addNum(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
            if(minHeap.size()>maxHeap.size()){
                maxHeap.offer(minHeap.poll());
            }
        }
        
         public double findMedian() {
             if(maxHeap.size()>minHeap.size()){
                 return maxHeap.peek();
             }
             return (maxHeap.peek()+minHeap.peek())/2.0;
        }
    }
}
