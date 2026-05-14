class Solution {
    public int loot(int i, int[] nums, int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];

        int include = nums[i] + loot(i+2,nums,dp);
        int exclude = loot(i+1,nums,dp);
        int ans = Math.max(include,exclude);
        dp[i] = ans;
        return ans;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int ans = loot(0,nums,dp);
        return ans;
    }
}
