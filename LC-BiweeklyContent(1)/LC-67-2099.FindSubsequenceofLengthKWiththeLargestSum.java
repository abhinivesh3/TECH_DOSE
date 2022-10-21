public class LC-67-2099.FindSubsequenceofLengthKWiththeLargestSum {
    class Solution {
        public int[] maxSubsequence(int[] nums, int k) {
            PriorityQueue<int[]> sub=new PriorityQueue<int[]>((a,b)->(a[0]-b[0]));
            for(int i=0;i<nums.length;i++){
                sub.offer(new int[]{nums[i],i});
                if(sub.size()>k){
                    sub.poll();
                }
            }
            Set<Integer>index=new HashSet<>();
            while(!sub.isEmpty()){
                int[] top=sub.poll();
                index.add(top[1]);
            }
            int[] ans=new int[k];
            int p=0;
            for(int i=0;i<nums.length;i++){
                if(index.contains(i)){
                    ans[p]=nums[i];
                    p++;
                }
            }
            return ans;
        }
    }
}
