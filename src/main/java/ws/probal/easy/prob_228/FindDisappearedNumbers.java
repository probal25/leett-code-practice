package ws.probal.easy.prob_228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1};
//        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int[] v = new int[len + 1];
        List<Integer> integers = new ArrayList<>();
        Arrays.fill(v, -1);

        for (int i = 0; i < len; i++) {
            v[nums[i]] = nums[i];
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] == -1 && i != 0) integers.add(i);
        }
        return integers;
    }
}
