package ws.probal.medium.prob_189;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // output -> 5,6,7,1,2,3,4
        int k = 3;

        System.out.println(Arrays.toString(rotate(nums, k)));
        System.out.println(Arrays.toString(rotate2(nums, k)));
    }

    public static int[] rotate(int[] nums, int k) {
        int target = nums.length - (k % nums.length);

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for (int i = target; i < nums.length; i++) {
            first.add(nums[i]);
        }

        for (int i = 0; i < target; i++) {
            second.add(nums[i]);
        }

        int pos = 0;

        for (Integer n : first) {
            nums[pos] = n;
            pos++;
        }

        for (Integer n : second) {
            nums[pos] = n;
            pos++;
        }
        return nums;
    }

    public static int[] rotate2(int[] nums, int k) {
        // original [1, 2, 3, 4, 5, 6, 7]
        // reverse the whole array [7,6,5,4,3,2,1]
        // reverse the first K(3) elements [5,6,7,4,3,2,1]
        // reverse the remaining elements [5,6,7,1, 2, 3, 4]
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
        return nums;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
