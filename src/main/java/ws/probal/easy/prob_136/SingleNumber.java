package ws.probal.easy.prob_136;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumberXOR(nums));
//        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> valueMap = new HashMap<>();
        for (Integer n : nums) {
            if (!valueMap.containsKey(n)) {
                valueMap.put(n, 1);
            } else {
                valueMap.put(n, valueMap.get(n) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : valueMap.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }

    public static int singleNumberXOR(int[] nums) {
        int result = 0;
        for (Integer n : nums) {
            result = result ^ n;
        }
        return result;
    }


}
