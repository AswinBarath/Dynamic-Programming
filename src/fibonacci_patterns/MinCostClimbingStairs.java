package fibonacci_patterns;

import java.util.Scanner;

class MCCStopDownApproach {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        int index0 = minCostClimbing(cost, 0, dp);
        int index1 = minCostClimbing(cost, 1, dp);
        return Math.min(index0, index1);
    }
    public int minCostClimbing(int[] cost, int i, int[] dp) {
        if(i >= cost.length) {
            return 0;
        }
        if(dp[i] != 0) {
            return dp[i];
        }
        
        int step1 = minCostClimbing(cost, i+1, dp);
        int step2 = minCostClimbing(cost, i+2, dp);
        dp[i] = cost[i] + Math.min(step1, step2);
        
        return dp[i];        
    }
}
public class MinCostClimbingStairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		MCCStopDownApproach tda = new MCCStopDownApproach();
		System.out.println(tda.minCostClimbingStairs(arr));
		in.close();
	}

}


/*
Pure recursive answer

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int index0 = minCostClimbing(cost, 0);
        int index1 = minCostClimbing(cost, 1);
        return Math.min(index0, index1);
    }
    public int minCostClimbing(int[] cost, int i) {
        if(i >= cost.length) {
            return 0;
        }
        
        int totalCost = 0;
        
        int step1 = minCostClimbing(cost, i+1);
        int step2 = minCostClimbing(cost, i+2);
        totalCost = cost[i] + Math.min(step1, step2);
        
        return totalCost;        
    }
}

*/

