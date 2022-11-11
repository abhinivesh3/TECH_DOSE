public class 23. Merge k Sorted Lists {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> minHeap=new PriorityQueue<>();
            for(int i=0;i<lists.length;++i){
                ListNode head=lists[i];
                while(head!=null){
                    minHeap.add(head.val);
                    head=head.next;
                }
            }
            ListNode head=new ListNode(0);
            ListNode temp=head;
            while(minHeap.size()>0){
                ListNode nn=new ListNode(minHeap.poll());
                temp.next=nn;
                temp=nn;
            }
            return head.next;
        }
    }
}
