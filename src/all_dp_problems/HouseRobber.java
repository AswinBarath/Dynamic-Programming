package all_dp_problems;
import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {

	public static int rob(int[] nums) {
		int[] dp = new int[nums.length + 1];
		Arrays.fill(dp, -1);
		return rob(nums, nums.length, dp);
	}

	public static int rob(int[] nums, int n, int[] dp) {

		// Base case

		if (n <= 0) {
			return 0;
		}

		if (dp[n] != -1) {
			return dp[n];
		}

		int choice1 = nums[n - 1] + rob(nums, n - 2, dp); // rob
		int choice2 = rob(nums, n - 1, dp); // don't rob

		return dp[n] = Math.max(choice1, choice2);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// No. of test cases
		int t = in.nextInt();
		while (t-- > 0) {
			// Size of the input
			int n = in.nextInt();
			// Array input
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			System.out.println(rob(arr));

		}
		in.close();
	}

	public static void main_V2(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 7, 9, 3, 1 };
		rob(arr);
	}

} 