package all_dp_problems;
import java.util.Arrays;
import java.util.Scanner;

class FibTopDownApproach {
    public int fib(int n) {
        int[] fibDP = new int[n+1];
        Arrays.fill(fibDP, -1);
        return fib(n, fibDP);
    }
    public int fib(int n, int[] dp) {
        // +ve base case
        if(n == 0 || n == 1) {
            return n;
        }
        // -ve base case
        if(n < 0) {
            return 0;
        }
        // dp - exp is stored and retrieved
        if(dp[n] != -1) {
            return dp[n];
        }
        
        // recursive cases
        int f_nm1 = fib(n-1, dp);
        int f_nm2 = fib(n-2, dp);

        return dp[n] = f_nm1 + f_nm2;
    }
}

class FibBottomUpApproach {
    // Bottom up approach
    public int fib(int n) {
        if (n <= 0) {
			return 0;
		}
        if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
    }
}

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// No. of test cases
		int t = in.nextInt();
		while (t-- > 0) {
			// Size of the input
			int n = in.nextInt();
			FibTopDownApproach tda = new FibTopDownApproach();
			System.out.println(tda.fib(n));
			FibBottomUpApproach bua = new FibBottomUpApproach();
			System.out.println(bua.fib(n));

		}
		in.close();

	}

} 