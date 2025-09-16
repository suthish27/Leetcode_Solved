class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] res = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            res[nums1.length + j] = nums2[j];
        }
        Arrays.sort(res);
        if (n % 2 == 1) {
            return res[n / 2];
        } else {
            return (res[n / 2 - 1] + res[n / 2]) / 2.0;
        }
    }
}
