class Solution {
    public int minMaxGame(int[] nums) {
        boolean isMin=true;
        int n=1;
        while(n<nums.length){
            for(int i=0;i<nums.length;i+=n*2){
                nums[i]=isMin ?Math.min(nums[i],nums[n+i]):Math.max(nums[i],nums[i+n]);
                isMin=!isMin;
            }
            n*=2;
        }
        return nums[0];
    }
}