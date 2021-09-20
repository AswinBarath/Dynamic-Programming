package knapsack_01_patterns;

import java.util.HashMap;
import java.util.Scanner;

//Time Complexity: O(n*m) where n = nums.length, m = state.length()
class PartitionTopDown {
 public boolean canPartition(int[] nums) {
     int total = 0;
     for(int i : nums) {
         total += i;
     }
     
     if(total % 2 != 0) {
         return false;
     }
     
     return canPartition(nums, 0, 0, total, new HashMap<String, Boolean>());
 }
 
 // Simulation of partition as subsets
 public boolean canPartition(int[] nums, int index, int sum, int total, HashMap<String, Boolean> state) {
     String current = index + " " + sum;
     if(state.containsKey(current)) {
         return state.get(current);
     }
     
     if(sum * 2 == total) {
         return true;
     }
     
     if(sum > total/2 || index >= nums.length) {
         return false;
     }
     
     boolean skip = canPartition(nums, index+1, sum, total, state);
     boolean choose = canPartition(nums, index+1, sum + nums[index], total, state);
     
     boolean foundPartition = skip || choose;
     state.put(current, foundPartition);
     
     return foundPartition;
 }
}


public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Size of the input
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		PartitionTopDown tda = new PartitionTopDown();
		System.out.println(tda.canPartition(arr));
//		PartitionBottomUpApproach bua = new PartitionBottomUpApproach();
//		System.out.println(bua.canPartition(arr));
		in.close();
	}

}

/*
Pure Recursive answer:
class Solution {
 public boolean canPartition(int[] nums) {
     int total = 0;
     for(int i : nums) {
         total += i;
     }
     
     if(total % 2 != 0) {
         return false;
     }
     
     returnn canPartition(num, 0, 0, total);
 }
 
 // Simulation of partition as subsets
 public boolean canPartition(int[] nums, int index, int sum, int total) {
     if(sum * 2 == total) {
         return true;
     }
     if(sum > total/2 || index >= nums.length) {
         return false;
     }
     
     boolean skip = canPartition(nums, index+1, sum, total);
     boolean choose = canPartition(nums, index+1, sum + nums[index], total);
     
     return skip || choose;
 }
}
*/