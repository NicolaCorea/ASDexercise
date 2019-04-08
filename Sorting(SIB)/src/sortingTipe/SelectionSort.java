/**
 * 
 */
package sortingTipe;
import mainStart.StartSorting;

/**
 * @author Nicola_Corea
 *
 */

public class SelectionSort {
	
	StartSorting print = new StartSorting();
	
	public void selectionSort(int [] item) {

        for(int i = 0; i < item.length-1; i++) { //scan the array from 0 to length-1
            System.out.println("");
        	System.out.println("Scan array from: " + item[i]);
        	
        	int min = i; //Start from i Element
            
        	System.out.println("actual minimum element is: " + item[min]);
            
        	for(int j = i+1; j < item.length; j++) { //scan the array
        		
        		System.out.println("Confront: " + item[min]);
        		System.out.println("With: " + item[j]);
            	// Here is the selection
        		// every time that in the iteration we find an element smaller than minimum
        		// let's make the found element look minimal
                if(item[min]>item[j]) {
                    System.out.println("Find new minimum element: " + item[j] );
                	min = j;
                    
                }
            }

        	// If minimal and different from the starting element
            // then the exchange takes place
            if(min!=i) {
            	
            	System.out.println("Exchange place of the elment: " + item[min]);
                
            	int k = item[min];
                item[min]= item[i];
                
                System.out.println("With: " + item[i]);
                
                item[i] = k;
                
                System.out.println("Actual Array is");
                print.printArray(item);
                
            }
        }
    }
}
