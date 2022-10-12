class NumArray {
    int[] dp;

    public NumArray(int[] nums) {
        int n = nums.length;
        dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = nums[i - 1] + dp[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return dp[right + 1] - dp[left];
    }
}