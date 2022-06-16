package Algorithms; //what does this mean?? why do you need to be here????

import java.util.Arrays;
import java.util.Random;

public class QuickSort{

    /**
	* Sorts argument array avec QuickSort algorithm.
	* No return as array will be mutated.
	* @param array - the input array
	**/
    public static void quickSortAsc(int[] array) {
        int size = array.length;
        int end = size-1;
        quickSortAsc(array, 0, end); //for QS(a, p, r)
          //a = array, p = start pos, r = last position
      }
  
      
    /**
     * Overloads the quickSortAsc method with start and end positions.
     * @param array - input 'sub-array'
     * @param start - beginning of sub-array
     * @param end - end of sub-array
     */
    private static void quickSortAsc(int[] array, int start, int end) {
        if (start < end) {
          int q = partition(array, start, end);
           quickSortAsc(array, start, q-1);
           quickSortAsc(array, q+1, end);
        }
    }
  

    /**
     * What does this do...
     * "Places a pivot element into its correct (sorted) position in the sub-array"?
     * @param array - input sub-array
     * @param start - beginning of sub-array
     * @param end - end of sub-array
     * @return - "the index for where the pivot was placed"?
     */
    private static int partition(int[] array, int start, int end) {
        int x = array[end]; //copy pivot element into var called x
        int i = start-1;
    
        for(int j = start; j <= end-1; j++){
            if(array[j] <= x){
                i++;
                
                //exchange(a[i], a[j]);
                int c = array[i]; 
                array[i] = array[j]; 
                array[j] = c; 
            }
        }

        //exchange(a[i+1], a[r]);
        int temp = array[i+1];
        array[i+1] = array[end];
        array[end] = temp;
        
        return i+1;
    }





    public static void main(String[] args) {

        //1. Create a variable that can hold random values.
        Random r = new Random(); 
        int randomBound = 10; //value will range from 0-9.
        int x = r.nextInt(randomBound); 
        
        //2. Create an array, to be sorted. 
        int arraySize = 10;
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];

        //3. Fill the array with random values.
        for(int i=0; i<arraySize; i++){
            array1[i] = x; 
            array2[i] = x; 
            x = r.nextInt(randomBound); //pick a new value for x
        }
       
        System.out.println("The unsorted array: " + Arrays.toString(array1));
        quickSortAsc(array1);
        System.out.println("Sorted, ascending: " + Arrays.toString(array1)); 
        // SortDescending(array2);
        // System.out.println("Sorted, descending: " + Arrays.toString(array2)); 
    }
}