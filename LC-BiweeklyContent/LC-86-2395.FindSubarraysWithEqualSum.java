public class LC-86-2395.FindSubarraysWithEqualSum {
    class Solution {
        public boolean findSubarrays(int[] nums) {
            int n=nums.length;
            int []ans=new int[n-1];
            for(int i=1;i<n;i++){
                ans[i-1]=nums[i-1]+nums[i];
            }
            Arrays.sort(ans);
            for(int i=0;i<n-2;i++){
                if(ans[i]==ans[i+1]){
                    return true;
                }
            }
            return false;
        }
    }
}
