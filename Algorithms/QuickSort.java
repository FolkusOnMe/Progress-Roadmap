package Algorithms; //what does this mean?? why do you need to be here????

import java.util.Arrays;
import java.util.Random;

public class QuickSort{
    //ok so what does QS do again.. 
    //IIRC, it just moves through each element of an array, and then compares
    //the pivot element to the left of it, if that element is GREATER, then it's 
    //pushed to the right. the comparison keeps happening until we either
    //hit <0 (before the start of the array) or we see an element that's 
    //less than the pivot 

    //what do we define. 
    //I know there's a for loop, that'll be j
    //and inside will be i.

    
    //have to make this 'static' apparently
    //so I can run it in the main method below.
    public static int[] Sort(int[] array){ 
        //ok. June 12, this didn't work yesterday.
        //I did this a few weeks ago but was basically translating from 
        //pseudocode.. gotta try and not need to rely on that.
        //oh it's raining now I love the rain :relieved:

        //so. let's write our own pseudocode.
        /** 
         * procedure SortAscending(array)
         *  for(int j = 1, j<array.length, j++) do 
         *      int i = j-1; //one to the left of j
         *      int pivot = array[j];
         * 
         *      while(i >= 0 && i > pivot) do 
         *          //so we've examined the current array[j] and found that i is >
         *          //now need to copy array[i] into i+1's place.
         *          array[i+1] = a[i];
         *          //and decrement i
         *          i--;
         *      end while 
         *      //after the while, we then need to put the pivot into.. where?
         *      //ok well i was defined inside this for so it's still accessible 
         *      //we can do: a[i].. a[i+1?]. wait think. no it would be a[i].
         *      a[i] = pivot;
         *  end for
         * ok let's try that. oh wait I just realised, 'pivot' is from the other
         * sorting algo. insertion sort? 
         */

    
        
        int size = array.length;

        for(int j=1; j<size; j++){
            int pivot = array[j];
            int i = j-1;
    
            while(i>= 0 && array[i] > pivot){
                // array[i+1] = pivot; //oh well obviously this is wrong. aiyaiyai
                array[i+1] = array[i];
                i--;
            }

            array[i+1] = pivot;
        }

        return array;
    }
    




    public static void main(String[] args) {
        //Should create an array, print it out, unsorted, and then sorted. 

        //how do you do random again.
        //int x = Math.random(100); //why- this should just work. 
        //ok I think I have to create a thing of Random 
        //java.lang.Math.random();
        //int x = Random(100); //nope. stil doesn't work. this is insulting.

        Random r = new Random(); //wait is that it. oh it imported util.random
        //oh here we go
        int randomBound = 10;
        int x = r.nextInt(randomBound); //how on EARTH are you supposed to intuit this.
        //d'you konw what would be better???
        //int  x = random(10); //why can't I just do that.

        int arraySize = 10;
        int[] array = new int[arraySize];

        //fill the array with random values.
        for(int i=0; i<arraySize; i++){
            array[i] = x;
            x = r.nextInt(randomBound);
        }


        //now let's try printing it out. HOPEFULLY it doesn't just assign one 
        //random value to x and then keep it that way...
        //omg it did. RIP me. maybe I'll just make x a new r.nextInt in the for
        //loop as well. Oh that actually worked.
        //ok well that took.. an inordinate amount of time. 

        System.out.println(Arrays.toString(array));
        Sort(array);
        System.out.println(Arrays.toString(array)); //this didn't work. um.
    }
}