package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort{
   
    /**
     * Method that examines input array and sorts it in ascending order, 
     * using InsertionSort.
     * 
     * @param array - the unsorted array 
     * @return - the sorted array.
     */
    public static int[] SortAscending(int[] array){
        int size = array.length;

        for(int j=1; j<size; j++){
            int pivot = array[j];
            int i = j-1;
    
            while(i>= 0 && array[i] > pivot){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = pivot;
        }

        return array;
    }
    

    
    /**
     * Method that examines input array and sorts it in descending order, 
     * using InsertionSort.
     * @param array - the unsorted array.
     * @return - the sorted array.
     */
    public static int[] SortDescending(int[] array){
        int size = array.length;

        for(int j=1; j<size; j++){
            int pivot = array[j];
            int i = j-1;

            while(i>=0 && array[i] < pivot){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = pivot;
        }

        return array;
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
        SortAscending(array1);
        System.out.println("Sorted, ascending: " + Arrays.toString(array1)); 
        SortDescending(array2);
        System.out.println("Sorted, descending: " + Arrays.toString(array2)); 
    }
}