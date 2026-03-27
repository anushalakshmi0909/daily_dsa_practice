import java.util.*;

public class Solution {

    // Fibonacci using DP
    public static int fibonacci(int n) {

        if(n <= 1)
            return n;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // Climbing Stairs using DP
    public static int climbStairs(int n) {

        if(n <= 2)
            return n;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));

        int stairs = 4;

        System.out.println("Ways to climb " + stairs + " stairs = " + climbStairs(stairs));
    }
}