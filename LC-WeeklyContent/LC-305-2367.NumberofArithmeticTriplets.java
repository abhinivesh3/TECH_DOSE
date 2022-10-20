public class LC-305-2367.NumberofArithmeticTriplets {
    class Solution {
        public int arithmeticTriplets(int[] nums, int diff) {
             int count = 0;
            Set<Integer> list = new HashSet<>();
            for (int num : nums) {
                if (list.contains(num - diff) && list.contains(num - diff * 2)) {
                    ++count;
                }
                list.add(num);
            }
            return count;
        }
    }
}
