package Leetcode;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, 2 is written as II in Roman numeral, just two ones added together. 
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, 
 * which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right. 
 * However, the numeral for four is not IIII. Instead, the number four is written 
 * as IV. Because the one is before the five we subtract it making four. 
 * The same principle applies to the number nine, which is written as IX. 
 * There are six instances where subtraction is used:
 *      I can be placed before V (5) and X (10) to make 4 and 9. 
 *      X can be placed before L (50) and C (100) to make 40 and 90. 
 *      C can be placed before D (500) and M (1000) to make 400 and 900.
 *      ...
 *      ...
 *      ...
 * 
 * Given a roman numeral, convert it to an integer.
 * 
 * Example 1:
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * 
 * 
 * Example 2:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * 
 * Example 3:
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * 
 * 
 * Constraints:
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 * 
 * 
 * 
 * Completed 05/25/2022 21:15
 * Runtime: 6ms
 * Memory: 45.2 MB
 */

public class 13_Roman_to_Integer {
        public int romanToInt(String s) {
            int result = 0;
            
            // //"Jamaica".substring(1); returns "amaica"
            // //s.charAt(0); will give first char of string.
            // //s.length()
            // //ah but what about numbers like IV {1,5} = 4.
            // //or CM {100,1000} = 900
            // //maybe define 
            // int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
            
            int i = 0;
            int charValue = 0;
            int mult;
            while(i < s.length()){
                
                if((i+1) < s.length() && value(s.charAt(i)) < value(s.charAt(i+1))){
                    mult = -1; 
                } else {
                    mult = 1;
                }
                
                charValue = value(s.charAt(i));
                
                result = result + (charValue * mult);
                i++;
            }
            
            
            return result;
        }
        
        public int value(char c){
            int value = 0; 
                
            switch (c){
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X': 
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;                
            }
            return value;
        }
        
}
