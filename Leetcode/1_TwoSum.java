package Leetcode;

/**
 * Given an array of integers `nums` and an integer `target`, return indices of 
 * the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * You can return the answer in any order.
 * 
 * e.g. 1 
 *    Input: nums = [2,7,11,15], target = 9 
 *    Output: [0,1] 
 *    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * e.g. 2
 *    Input: nums = [3,2,4], target = 6 
 *    Output: [1,2] 
 * 
 * e.g. 3
 *    Input: nums = [3,3], target = 6
 *    Output: [0,1]
 * 
 * Constraints:
 *  2 <= nums.length <= 104
 *  -109 <= nums[i] <= 109
 *  -109 <= target <= 109
 *  Only one valid answer exists.
 * 
 * 
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 *  I CAN!!!! Solution with sorting:
 *      Runtime: 4 ms, faster than 71.04% of Java online submissions for Two Sum.
 *      Memory Usage: 42.4 MB, less than 88.07% of Java online submissions for Two Sum.

 */


public class TwoSum {
    

    public int[] twoSum(int[] nums, int target){
        int size = nums.length;
        int[] answer = new int[2];

        // //solution without sorting
        // for(int i=0; i<size; i++){ //O(n)
        //     for(int j=0; j<size; j++){ // * O(n)
        //         if(j != i && nums[j] + nums[i] == target){
        //             answer[0] = j;
        //             answer[1] = i;
        //             break;
        //         }
        //     }
        // }


        //solution with sorting
        int[] array = new int[size];
        
        for(int i=0; i<size; i++){
            array[i] = nums[i];
        }
        
        mergeSortAsc(array);

        int i=0;
        int j=size-1;

        while(i != j){
            if(array[i] + array[j] == target){
                for(int a=0; a<size; a++){
                    if(array[i] == nums[a]){
                        answer[0] = a;
                        break;
                    }
                }
                for(int a=size-1; a>0; a--){
                    if(array[j] == nums[a]){
                        answer[1] = a;
                        break;
                    }
                }
                break;
            }

            if(array[i] + array[j] < target){i++;}
            if(array[i] + array[j] > target){j--;}
        }



        return answer;  
    }


    public static void mergeSortAsc(int[] array){
        int size = array.length;
        int end = size-1;
        mergeSortAsc(array, 0, end);
    }
        
    private static void merge(int[] array, int start, int midpoint, int end){
        int sizeLHS = midpoint - start + 1;
        int sizeRHS = end - midpoint;
        int[] LHS = new int[sizeLHS]; 
        int[] RHS = new int[sizeRHS];
        
        
        for(int i = 0; i < sizeLHS; i++){ 
            LHS[i] = array[start + i]; 
        }
        
        
        for(int j = 0; j < sizeRHS; j++){
            RHS[j] =  array[midpoint + j + 1]; 
        }
        
        //i,j, and k will keep the position for the comarison of arrays
        int i = 0;
        int j = 0;
        int k = start;
        
        while(i < sizeLHS && j < sizeRHS){
            if(LHS[i] <= RHS[j]){
                array[k] = LHS[i]; 
                k++;
                i++;
            } else {
                array[k] = RHS[j];
                k++;
                j++;
            }
        }
            
        while(i < sizeLHS){
            array[k] = LHS[i];
            k++;
            i++;
        }
        
        while(j < sizeRHS){
            array[k] = RHS[j];
            k++;
            j++;
        }
        
    }
   
    private static void mergeSortAsc(int[] array, int start, int end){
        if(start < end){
            int midpoint = (start + end)/2;
            
            mergeSortAsc(array, start, midpoint);
            mergeSortAsc(array, midpoint+1, end); 
            merge(array, start, midpoint, end);
        }
    }


    
}
