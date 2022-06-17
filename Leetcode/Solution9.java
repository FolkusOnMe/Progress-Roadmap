package Leetcode;

import java.util.Stack;

/**
 * 9. Palindrome Number
 * 
 * Given an integer x, return true if x is palindrome integer.
 
 * An integer is a palindrome when it reads the same backward as forward.
 * 
 * For example, 121 is a palindrome while 123 is not.
 * 
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * 
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 * 
 * Constraints:
 * -231 <= x <= 231 - 1 
 * 
 * 
 * Follow up: Could you solve it without converting the integer to a string?
 * (I didn't even know you could turn an int into a string. makes sense though.)
 */



public class Solution9 {
    public boolean isPalindrome(int x) {
        boolean result = false;
        
//https://stackoverflow.com/questions/1306727/way-to-get-number-of-digits-in-an-int
        int length = (int)(Math.log10(x)+1);
        
        
        
        if(x%9 <= 9){return true;}
        else if(x<0){result = false;} 
        else {
            Stack<Integer> theStack = new Stack<Integer>();
            while(x>=10){
                
                if(x==10){
                    theStack.push(0);
                    theStack.push(1);
                    break;
                }
                
                theStack.push(x%10);
                x = x%10;
                if(x<10){
                    theStack.push(x);
                }
            }
            
            int[] forward = new int[length];
            int[] backward = new int[length];
            
            for(int i=0; i<length; i++){
                int item = (Integer) theStack.pop();
                int end = length -1;
                
                backward[i] = item;
                forward[end - i] = item;
            }
            
            for(int i=0; i<length; i++){
                int j = length-1;
                
                if(i != j && forward[i] == backward[j]){
                    j--;
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        
        
        return result;
    }



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        int num = 123;
        
        int num1 = num%10;
        num = num/10;

        int num2 = num%10;
        num = num/10;

        int num3 = num%10;

        System.out.println(num1 + " - " + num2 + " - " + num3);
        
    }
}
