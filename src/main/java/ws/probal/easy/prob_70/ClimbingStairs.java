package ws.probal.easy.prob_70;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 45;
        long startTime = System.currentTimeMillis();
        System.out.println(climbStairsWithTabulation(n));
//        System.out.println(climbStairs(n));
        long endTime = System.currentTimeMillis();
        long diff = endTime - startTime;
        System.out.println("Time taken to compute: " + diff);
    }

    public static int climbStairs(int n) {
        // this will give tle
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairsWithTabulation(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
