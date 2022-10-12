class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int mask=0;
        for(int i=0;i<n;i++){
            mask^=nums[i];
        }
        return mask;
    }
}