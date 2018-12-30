package algo.practice;

/* Practice going through every portion of the loops typing in where i & j are and work through it
*
*  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |      <--- Indecies
*  ______________________________________________
*  { 3 , 5 , 6 , 1 , 10, 2 , 4 , 9 , 8 , 0 ,  7  }     <--- Original Array
*  ______________________________________________
*                                                      <--- Sorted Array
*        i                                             <--- Outer Loop of i
*    j                                                 <--- Inner Loop of j
*   curent key (aka i) = 5
*
*                   time = n squared
*
*/

//class name
public class InsertionSort {
//  main method to run program    
    public static void main(String[] args) {
//      array of type integer created called numbers = to whatever values are set        
        int[] numbers = {3, 5, 6, 1, 10, 2, 4, 9, 8, 0, 7}; 
//      call the method to sort array (numbers), ascending, then print        
        insertionSort(numbers);
        printArray(numbers);

//      call the method to sort array (numbers), descending, then print        
        insertionSort2(numbers);
        printArray(numbers);
    }
    
//  start of method to create inserting sort algo    
    public static int[] insertionSort(int[] Array) {
//      start loop through array setting i to index of 1
//      key is set to whatever the integer at index i is
//      set j = to i - 1
        for (int i = 1; i < Array.length; i++) {
            int key = Array[i];
            int j = i - 1;
//          if index j >= 0, see next condition
//          and the integer at index j is --- greater than the key (for ascending ordered list)
//                                        --- less than the key (for descending ordered list)
//          enter while loop
            while(j >= 0 && Array[j] > key) {
//              set the current index of j + 1 = to whatever the integer is, basically moving it over + 1 index slot                
                Array[j + 1] = Array[j];
//              decrement index of j to move down the array                
                j--;
            }
//          when while loop breaks or if never entered, set j + 1 = to the current key
//          if i is < Array.length, increment, if not then end loop
            Array[j + 1] = key;
        }
//      once loop breaks, return results of array [A]
        return Array;
    }
    
//  method created to print Array
    public static void printArray(int[] Array) {
//      loops through array, at each index will print integer + , and space after        
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] +  ", ");
        }
//      after array prints, makes a new line        
        System.out.println();
    }


// this is what the algo looks like without all the comments, same thing, descending order

    public static int[] insertionSort2(int[] Array) {
        for (int i = 1; i < Array.length; i++) {
            int key = Array[i];
            int j = i - 1;

            while (j >= 0 && Array[j] < key) { // reverse the > to < for descending order
                Array[j + 1] = Array[j];
                j--;
            }
            Array[j + 1] = key;
        }
        return Array;
    }
}

