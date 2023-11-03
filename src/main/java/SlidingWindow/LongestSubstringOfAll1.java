package SlidingWindow;

/**
 * Example 2: You are given a binary string s (a string containing only "0" and "1"). You may choose up to one "0" and flip it to a "1". What is the length of the longest substring achievable that contains only "1"?
 *
 * For example, given s = "1101100111", the answer is 5. If you perform the flip at index 2, the string becomes 1111100111.
 */
public class LongestSubstringOfAll1 {
    public int findLength(String s) {
        int right=0,left=0;
        return right-left+1;
    }
}
