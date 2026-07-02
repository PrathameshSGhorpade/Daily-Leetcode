class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currSum1 = 0;
        int currSum2 = 0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            currSum1 += nums[i];
            currSum2 += nums[i];
            maxi = Math.max(maxi, currSum1);
            if(currSum1 < 0) currSum1 = 0;
            mini = Math.min(mini, currSum2);
            if(currSum2 > 0) currSum2 = 0;
        }
        return (totalSum == mini) ? maxi:Math.max(maxi,totalSum - mini);
    }
}