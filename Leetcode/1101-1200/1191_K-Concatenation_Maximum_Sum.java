package Leetcode.1101-1200;

/**
 * Given an integer array arr and an integer k, modify the array by 
 * repeating it k times.
 * 
 * For example, if arr = [1, 2] and k = 3 then the modified array will be 
 * [1, 2, 1, 2, 1, 2].
 * 
 * Return the maximum sub-array sum in the modified array. Note that the length
 * of the sub-array can be 0 and its sum in that case is 0.
 * 
 * As the answer can be very large, return the answer modulo 109 + 7.
 * 
 * 
 * Example 1:
 * Input: arr = [1,2], k = 3
 * Output: 9
 * 
 * 
 * Example 2:
 * Input: arr = [1,-2,1], k = 5
 * Output: 2
 * 
 * 
 * Example 3:
 * Input: arr = [-1,-2], k = 7
 * Output: 0
 * 
 * 
 * Constraints:
 * 1 <= arr.length <= 105
 * 1 <= k <= 105
 * -104 <= arr[i] <= 104
 * 
 * 
 * "Return the maximum sub-array sum" means 'look at the entire array and check:
 * is there some portion of it that, when summed, gives the highest value?'
 * 
 * e.g. {10, 10, 10, 10, -100} is an array. the sum of the entire array is -60.
 * but. if you ignore the last element, then the max sum is 40. Those first 4
 * elements are a sub-array. They're a set of contiguous elements within the main
 * array.
 * 
 * Apparently the best (or one of the best) algo's to tackle this is 
 * Kadane's algorithm
 */
public class 1191_K-Concatenation_Maximum_Sum {
    
}
