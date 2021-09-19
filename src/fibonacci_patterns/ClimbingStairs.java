package fibonacci_patterns;

import java.util.Arrays;
import java.util.Scanner;

class TopDownApproach {
    public int climbStairs(int n) {
        int[] count = new int[n + 1];
		Arrays.fill(count, -1);
		return climbStairs(n, count);
    }
    public int climbStairs(int n, int[] count) {
        // Positive base case
        if(n==0) {
            return 1;
        }
        // Negative base case
        if(n<0) {
            return 0;
        }
        
        // DP
        if(count[n] != -1) {
            return count[n];
        }
        
        // Recursive cases
        int choice1 = climbStairs(n-1, count);
        int choice2 = climbStairs(n-2, count);
        return count[n] = choice1 + choice2;
    }
}

class BottomUpApproach {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
			return n;
		}
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
    }
}

public class ClimbingStairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// No. of test cases
		int t = in.nextInt();
		while (t-- > 0) {
			// Size of the input
			int n = in.nextInt();
			TopDownApproach tda = new TopDownApproach();
			System.out.println(tda.climbStairs(n));
			BottomUpApproach bua = new BottomUpApproach();
			System.out.println(bua.climbStairs(n));

		}
		in.close();
	}

}
