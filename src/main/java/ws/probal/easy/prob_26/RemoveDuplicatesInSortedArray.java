package ws.probal.easy.prob_26;

import java.util.*;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!values.contains(nums[i])) {
                values.add(nums[i]);
            }
        }
        int k = 0;

        for (int i = 0; i < values.size(); i++) {
            nums[k] = values.get(i);
            k++;
        }
        return k;
    }
}
