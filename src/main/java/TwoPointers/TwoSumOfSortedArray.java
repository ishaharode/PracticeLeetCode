package TwoPointers;

/**
 * Example 2: Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
 *
 * For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
 *
 *
 * For unsorted Array time complexity = O(n^2)  [The brute force solution would be to iterate over all pairs of integers. Each number in the array can be paired with another number, so this would result in a time complexity of O(n^2))]
 * For Sorted array time complexity = O(n)
 * Space complexity: O(1)
 */
public class TwoSumOfSortedArray {
    public boolean checkForTarget(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int curr= nums[left]+nums[right];
            if(curr==target){
                return true;
            }
            else if(curr>target){
                right--;
            }
            else{
                left++;
            }

        }
        return false;
    }

}
