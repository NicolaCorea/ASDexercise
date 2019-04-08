/**
 * 
 */
package sortingTipe;
import mainStart.StartSorting;

/**
 * @author Nicola_Corea
 *
 */

public class InsertionSort {
	
	StartSorting print = new StartSorting();
	
	/*Function to sort array using insertion sort*/
    public void insertionSort(int item[]) { 
       // int n = item.length; 
        for (int i = 1; i < item.length; ++i) { 
        	System.out.println("");
        	System.out.println("Scan array from element: " + item[i] + " this element is the key");
            int key = item[i]; 
            int j = i - 1; 
            System.out.println("Confront the key: " + item[i] + " at position: " + i);
            System.out.println("With the element: " + item[j] + " at position: " + j);
            /* Move elements of item[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && item[j] > key) { 
    
            	System.out.println("Swap element: " + item[j+1]);
            	System.out.println("With element: " + item[j]);
            	
                item[j + 1] = item[j]; 
                j = j - 1; 
                
            } 
            item[j + 1] = key; 
            
            System.out.println("Actual Array is");
            print.printArray(item);
            System.out.println("");
        } 
    } 
}
