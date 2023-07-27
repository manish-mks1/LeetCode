// 53. Maximum Subarray
// Medium
// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

class Solution {
    int maxCrossingSum(int arr[], int l, int m,
                              int h)
    {
        int sum = 0,left_sum=Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m; i <= h; i++) {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }
        return Math.max(left_sum + right_sum - arr[m],
                        Math.max(left_sum, right_sum));
    }
    int maxSubArraySum(int arr[], int l, int h)
    {
          if (l > h)
              return Integer.MIN_VALUE;
        if (l == h)
            return arr[l];
        int m = (l + h) / 2;
        return Math.max(
            Math.max(maxSubArraySum(arr, l, m-1),
                     maxSubArraySum(arr, m + 1, h)),
            maxCrossingSum(arr, l, m, h));
    }
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sum = maxSubArraySum(nums, 0, n - 1);
        return max_sum;
    }
}