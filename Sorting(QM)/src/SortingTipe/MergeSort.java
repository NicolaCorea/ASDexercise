/**
 * 
 */

package SortingTipe;
import mainStart.StartSorting;
/**
 * @author Nicola_Corea
 *
 */

public class MergeSort {
	
StartSorting print = new StartSorting();
	
	public void mergeSort(int[] item, int first, int last) { // Main function that sorts item[l..r] using merge() 
		
		if(first < last) {
			
			int middle = (first + last) / 2;//find the middle point
			
			mergeSort(item, first, middle);// Sort first and second halves 
			mergeSort(item, middle+1, last);
			
			merge(item, first, middle, last);// Merge the sorted halves 
		}
	}
	
	// Merges two subArrays of item[]. 
    // First subArray is item[l..m] 
    // Second subArray is item[m+1..r] 
	
	public void merge(int[] item, int first, int middle, int last) {
		
		// Find sizes of two subArrays to be merged
		int n1 = middle - first + 1;
		int n2 = last - middle;
		
		/* Create temporary arrays */
		int temp1[] = new int[n1];
		int temp2[] = new int[n2];
		
		/*Copy data to temporary arrays*/
		for(int i = 0; i < n1; i++) {
			temp1[i] = item[first + i];
		}
		System.out.println("find first part");
		print.printArray(temp1); System.out.println("");
		for(int j = 0; j < n2; j++) {
			temp2[j] = item[middle + 1 + j];
		}
		System.out.println("find second part");
		print.printArray(temp2); System.out.println("");
		
		/* Merge the temporary arrays */
		  
        // Initial indexes of first and second subArrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subArray array 
		int k = first;
		
		while(i < n1 && j < n2) {
			
			if(temp1[i] <= temp2[j]) {
				
				item[k] = temp1[i];
				i++;
				k++;
				
			}else {
				
				item[k] = temp2[j];
				j++;
				k++;
				
			}
			
		}
		
		 /* Copy remaining elements of temp1[] if any */
        while (i < n1) 
        { 
            item[k] = temp1[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of temp2[] if any */
        while (j < n2) 
        { 
            item[k] = temp2[j]; 
            j++; 
            k++; 
        } 
        
	}
	
}
