class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int count = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                c = 1;
                break;
            } else {
                count++;
            }
        }
        if (c == 0) {
            return -1;
        } else {
            return count;
        }
    }
}