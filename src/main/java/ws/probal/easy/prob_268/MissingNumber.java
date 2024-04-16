package ws.probal.easy.prob_268;

import java.util.Arrays;// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
import java.util.List;

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int[] v = new int[len + 1];
        Arrays.fill(v, -1);

        for (int i = 0; i < len; i++) {
            v[nums[i]] = nums[i];
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] == -1) return i;
        }
        return 0;
    }
}


