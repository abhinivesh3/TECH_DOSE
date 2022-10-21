public class LC-73-2190.MostFrequentNumberFollowingKeyInanArray {
    class Solution {
        public int mostFrequent(int[] nums, int key) {
            int l = nums.length;
            int max = 0,m=0;
            int c[] = new int[1001];
            Arrays.fill(c,0);
            for(int i=0;i<l-1;i++)
            {
                if(nums[i] == key)
                {
                    c[nums[i+1]]++;
                }
            }
            for(int i=0;i<l;i++)
            {
                if(c[nums[i]] > max)
                {
                    max = c[nums[i]];
                    m = nums[i];
                }
            }
            return m;
        }
    }
}
