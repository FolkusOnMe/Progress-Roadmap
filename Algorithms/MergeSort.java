package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    
    public static void mergeSortAsc(int[] array){
        int size = array.length;
        int end = size-1;
        mergeSortAsc(array, 0, end);
    }
        
    /**
     * A private method to merge the elements in the array between p and r.
     * the array a, between the indices p and r, inclusive.
     * Given the array is sorted between p and q and q+1 and r
     * sorts the array between p and r.
     * @param array the array to be sorted, which is mutated by the method
     * @param start the lower index of the range to be partitioned
     * @param midpoint the midpoint of the two sorted sections.
     * @param end the upper index of the range to be paritioned
     * @return the index of the point of partition
     **/
    private static void merge(int[] array, int start, int midpoint, int end){
        int sizeLHS = midpoint - start + 1;
        int sizeRHS = end - midpoint;
        int[] LHS = new int[sizeLHS]; //the LHS array
        int[] RHS = new int[sizeRHS]; //the RHS array
        
        
        for(int i = 0; i < sizeLHS; i++){ //i=0, instead of i=1, & < not <=, to conv
            LHS[i] = array[start + i]; //+1 to convert from pseudoCode
        }
        
        
        for(int j = 0; j < sizeRHS; j++){
            RHS[j] =  array[midpoint + j + 1]; //+1 to convert from pseudoCode
        }
        
        //i,j, and k will keep the position for the comarison of arrays
        int i = 0;
        int j = 0;
        int k = start;
        
        while(i < sizeLHS && j < sizeRHS){
            if(LHS[i] <= RHS[j]){ //finding lower val
                array[k] = LHS[i]; //add LHS val to a
                k++;
                i++;
            } else {
                array[k] = RHS[j]; //add RHS val to a
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
    
    /**
     *Overloads the mergeSort method with parameters to set the range to be sorted.
    **/ 
    private static void mergeSortAsc(int[] array, int start, int end){
        if(start < end){
            int midpoint = (start + end)/2;
            
            mergeSortAsc(array, start, midpoint); //first 'half'
            mergeSortAsc(array, midpoint+1, end); //latter 'half'
            merge(array, start, midpoint, end);
        }
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
        mergeSortAsc(array1);
        System.out.println("Sorted, ascending: " + Arrays.toString(array1)); 
        // SortDescending(array2);
        // System.out.println("Sorted, descending: " + Arrays.toString(array2)); 
    }
}
