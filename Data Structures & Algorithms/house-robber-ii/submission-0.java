class Solution {
    public int robHelper(int[] nums,int start, int end){
        int prev1 = 0;
        int prev2 = 0;
        for(int i=start;i<=end;i++){
            int exclude = nums[i] + prev2;
            int include = prev1;

            int curr = Math.max(include,exclude);

            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        
        int case1 = robHelper(nums,0,n-2);
        int case2 = robHelper(nums,1,n-1);

        return Math.max(case1,case2);
    }
}
