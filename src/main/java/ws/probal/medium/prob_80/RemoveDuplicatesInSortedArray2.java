package ws.probal.medium.prob_80;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicatesInSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> values = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!count.containsKey(nums[i])) {
                count.put(nums[i], 1);
                values.add(nums[i]);
                continue;
            }
            if (count.get(nums[i]) != 2) {
                count.put(nums[i], 2);
                values.add(nums[i]);
            }
        }
        int k = 0;

        System.out.println(values);
        for (int i = 0; i < values.size(); i++) {
            nums[k] = values.get(i);
            k++;
        }
        return k;
    }
}
