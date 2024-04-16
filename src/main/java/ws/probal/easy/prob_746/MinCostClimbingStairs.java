package ws.probal.easy.prob_746;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int len  = cost.length;
        return Math.min(minCost(cost, len-1), minCost(cost, len-2));
    }

    private static int minCost(int[] cost, int n) {
        if (n < 0) return 0;
        if (n == 0 | n == 1) return cost[n];
        return cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
}
