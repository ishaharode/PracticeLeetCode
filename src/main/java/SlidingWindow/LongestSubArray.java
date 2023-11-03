package SlidingWindow;

/**
 * Example 1: Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less than or equal to k. This is the problem we have been talking about above. We will now formally solve it.
 *
 * time complexity of = O(n)
 */
public class LongestSubArray {
    public int findLength(int[] nums, int k) {
        int curr=0, right=0, left=0,ans=0;
        for(right=0;right<nums.length;right++)
        {
            curr+=nums[right];
            while(curr>k)
            {
                curr-=nums[left];
                left++;
            }

            ans=Math.max(ans,right-left+1);

        }

        return ans;

    }

}
