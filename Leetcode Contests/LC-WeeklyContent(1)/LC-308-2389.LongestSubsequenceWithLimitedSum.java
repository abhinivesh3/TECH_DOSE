public class LC-308-2389.LongestSubsequenceWithLimitedSum {
    class Solution {
        public int[] answerQueries(int[] nums, int[] queries) {
            int n=nums.length,m=queries.length;
            Arrays.sort(nums);
            int ans[]=new int[m];
            for(int i=0;i<m;i++){
                int c=0;
                int q=queries[i];
                for(int num:nums){
                    if(num<=q){
                        c++;
                        q-=num;
                    }
                    else{
                        break;
                    }
                }
                ans[i]=c;
            }
            return ans;
        }
    }
}
