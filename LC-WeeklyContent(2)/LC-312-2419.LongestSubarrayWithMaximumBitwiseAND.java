package LC-WeeklyContent(2);

public class LC-312-2419.LongestSubarrayWithMaximumBitwiseAND {
    class Solution {
        public int longestSubarray(int[] nums) {
            int maxLen=0,n=nums.length,maxVal=0;
            for(int i=0;i<n;i++){
                if(maxVal<nums[i]){
                    maxVal=nums[i];
                }
            }
            int curr=0;
            for(int i=0;i<n;i++){
                if(nums[i]==maxVal){
                    curr++;
                }
                else{
                    maxLen=Math.max(maxLen,curr);
                    curr=0;
                }
            }
            maxLen=Math.max(maxLen,curr);
            return maxLen;
        }
    }
}
