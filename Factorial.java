package datastructures;

public class Factorial {
	static int n=5;
	public static void main(String[] args) {
		System.out.println(recursionfact(n));
		System.out.println(memoization(n));
		System.out.println(tabulation(n));
	}
	private static int recursionfact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*recursionfact(n-1);
		}
	}
	public static int memoization(int n) {
	        int[] memo=new int[n + 1];
	        if (n <= 1) {
	            return 1;
	        } else if (memo[n] != 0) {
	            return memo[n];
	        } else {
	            memo[n] = n * memoization(n - 1);
	            return memo[n];
	        }
	    }
	public static int tabulation(int n) {
		int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }
        return dp[n];
	}
		
}
