package all_dp_problems;

import java.util.Arrays;

public class Rod_Cutting {
    int[] dp;
    
    public int cutRod(int[] price, int n) {
        // base case
        if(n==0) return 0;
        
        // memoization
        // check if already computed
        if(dp[n] != -1) return dp[n];
        
        // recursive case
        int max = Integer.MIN_VALUE;
        
        // try all cuts from 1 to n
        for(int i=0; i<n; i++) {
            int cut = i + 1;
            int currentCut = price[i] + cutRod(price, n - cut);
            max = Math.max(max, currentCut);
        }
        dp[n] = max;
        return max;
    }
    
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return cutRod(price, n);
    }
}
