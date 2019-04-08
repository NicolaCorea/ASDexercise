/**
 * 
 */

package SortingTipe;
import mainStart.StartSorting;
/**
 * @author Nicola_Corea
 *
 */

public class QuickSort {
	
	StartSorting print = new StartSorting();
	
	/**
	 * The main function that implements QuickSort()
	 * item[] --> Array to be sorted,
	 * low  --> Starting index, 
	 * high  --> Ending index
	 */
	public void quickSort(int[] item, int low, int high) {
		
		if (low < high) { 
            
			int pi = partition(item, low, high); // pi is partitioning index, item[pi] is now at right place
            quickSort(item, low, pi-1);  // Recursively sort elements before 
            quickSort(item, pi+1, high); // partition and after partition 
            
        } 
	
	}
	
	private int partition(int[] item, int low, int high) {
		
		int pivot = item[high];
		int i = low-1; //index of smaller element
		//int i = low;
		for(int j = low; j < high; j++) {
			
			if(item[j] <= pivot) { // If current element is smaller than or equal to pivot

				i++; // swap item[i] and item[j]
				int temp = item[i];
				item[i] = item[j];
				item[j] = temp;
				print.printArray(item);
				System.out.println("");
			}
			
		}
		// swap item[i+1] and item[high] (or pivot)
        int temp = item[i+1]; 
        item[i+1] = item[high]; 
        item[high] = temp; 
        print.printArray(item);
		System.out.println("");
		return i+1;
	}
		
}
