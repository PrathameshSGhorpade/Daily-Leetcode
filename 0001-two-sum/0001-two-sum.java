import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if(n < 2) {
            return new int[0];
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                    if(sum == target) {
                    return new int[]{i, j};
                }  
            }
        }
        return new int[0];
    }
}