package ws.probal.easy.prob_88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        for (int j = m; j < nums1.length; j++) {
            nums1[j] = nums2[i];
            i++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
