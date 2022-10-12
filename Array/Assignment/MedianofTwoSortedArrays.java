class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] array = new int[n];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            array[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < nums2.length; i++) {
            array[k] = nums2[i];
            k++;
        }
        Arrays.sort(array);
        if (n % 2 != 0) {
            return array[n / 2];
        } else {
            return (array[n / 2] + array[n / 2 - 1]) / 2.0;
        }
    }
}