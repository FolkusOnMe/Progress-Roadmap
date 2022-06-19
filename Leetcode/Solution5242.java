package Leetcode;
import java.util.Arrays;


/**
 * 5242. Greatest English Letter in Upper and Lower Case My SubmissionsBack to Contest
User Accepted: 7760
User Tried: 8233
Total Accepted: 7815
Total Submissions: 10209
Difficulty: Easy
Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.

 

Example 1:

Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.
Example 2:

Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
Example 3:

Input: s = "AbCdEfGhIjK"
Output: ""
Explanation:
There is no letter that appears in both lower and upper case.
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase and uppercase English letters.

 */


public class Solution5242 {
    public String greatestLetter(String s) {
        String result = "";
        int size = s.length();
        
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        // String newString = new String(charArray);
        // s = String.valueOf(charArray);
        
        for(int i=0; i<size; i++){
            char current = s.charAt(i);
            if(i != size - 1){
                char next = s.charAt(i+1);
                if(Character.compare(current,next) > 0){
                    //current==next; 0
                    //current<next; <0
                    //current>next; >0
                    
                    
                    if(Character.isUpperCase(current)){
                        char x = Character.toLowerCase(current);
                        if(s.indexOf(x)>=0){
                            result = Character.toString(current);
                            return result;
                        }
                    }   
                    
                    
                    if(Character.isLowerCase(current)){
                        char x = Character.toUpperCase(current);
                        if(s.indexOf(x)>=0){
                            result = Character.toString(x);
                            return result;
                        }
                    }
                    
                } 
                    
            }
        }
        
        return result;
    }
}
