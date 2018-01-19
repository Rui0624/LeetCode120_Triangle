import java.util.ArrayList;

public class Solution {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        
        for(int i = 0; i < n ; i++){
        	dp[i] = triangle.get(n - 1).get(i);
        }
        
        for(int i = n - 2; i < 0; i--){
        	for(int j = 0; j <= i; j++){
        		dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
        	}
        }
        
        return dp[0];
    }
}
