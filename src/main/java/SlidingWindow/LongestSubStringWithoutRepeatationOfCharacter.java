package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring without repeating characters
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

public class LongestSubStringWithoutRepeatationOfCharacter {
        public int lengthOfLongestSubstring(String s) {
            int right=0,left=0,ans=0;
            int n = s.length();
            Map<Character, Integer> map = new HashMap<>();

            for(right =0;right<n;right++)
            {

                map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
                while(map.get(s.charAt(right))>1)
                {
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;

                }
                ans=Math.max(ans,right-left+1);
            }


            return ans;

        }

}
