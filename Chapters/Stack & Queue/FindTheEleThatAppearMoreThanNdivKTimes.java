import java.util.*;

public class FindTheEleThatAppearMoreThanNdivKTimes {
    public static List<Integer> majorityElement(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> o : map.entrySet()) {
            if (o.getValue() > n / k) {
                res.add(o.getKey());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();
        System.out.println(majorityElement(nums, k));
    }
}

}
