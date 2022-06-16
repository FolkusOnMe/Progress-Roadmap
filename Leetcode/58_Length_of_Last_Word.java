package Leetcode;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * 
 * Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * 
 * 
 * Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * 
 * 
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 * 
 * 
 * Completed: 06/16/2022 23:46
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
 * Memory Usage: 42.1 MB, less than 61.12% of Java online submissions for Length of Last Word
 */

public class 58_Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        int end = s.length()-1;
        int result = 0;
        
        while(end >= 0 && s.charAt(end) == ' '){
            end--;
        }
        
        while(end >= 0 && s.charAt(end) != ' '){
            result++;
            end--;
        }
        
        return result;
    }
}
