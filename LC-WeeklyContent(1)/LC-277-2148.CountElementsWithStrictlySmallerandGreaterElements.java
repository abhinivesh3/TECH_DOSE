class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int a : nums) {
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        for (int i = 0; i < n; i += 1) {
            if (nums[i] > min && nums[i] < max) {
                count += 1;
            }
        }
        return count;
    }
}