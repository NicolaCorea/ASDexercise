/**
 * 
 */

package mainStart;
import java.util.Random;
import java.util.Scanner;

import SortingTipe.QuickSort;
import SortingTipe.MergeSort;
/**
 * @author Nicola_Corea
 *
 */

public class StartSorting {
	
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	
	/* Fill the Array */
	public void fillArray(int[] item) {
		
		int n;
		
		for(int i = 0; i < item.length; i++) {
			n = rand.nextInt(1000);
			item[i] = n;
			
		}
		
	}
	
	/* Prints the array */
    public void printArray(int[] item) {
       
        for (int i = 0; i < item.length; ++i) {
        	
        	System.out.print(item[i] + " - ");
            
        }
        
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/****************************************************************************/
		
		StartSorting sort = new StartSorting();
		System.out.println("Welcome to AllAboutSorting");
		System.out.println("Please enter the size of your array");
		
		int size = scan.nextInt();
		int[] array = new int[size];
		int length = array.length - 1;
		
		System.out.println("Your Array size is: " + size);
		System.out.println("I'll go to fill it");
		System.out.println("fill... please wait... ");
		
		sort.fillArray(array);
		
		System.out.println("fill complete... your array is: ");
		
		sort.printArray(array);
		
/****************************************************************************/
		
		char ans;
		boolean decision = false;
		
		while(!decision) {
			
			System.out.println("");
			System.out.println("you want to continiue? (Y/N)");
			
			ans = scan.next().charAt(0);
			
			if(ans == 'y' || ans == 'Y') {
				
				decision = true;
				
			}else if(ans == 'n' || ans == 'N') {
				
				System.out.println("bye bye");
				System.exit(0);
				
			}else {
				
				decision = false;
				
			}
			
		}
		
/****************************************************************************/
		
		int ans2;
		boolean decision2 = false;
		
		while(!decision2) {
			
			System.out.println("What sorting algorithm you want to use?");
			System.out.println("tap '1' for QuickSort");
			System.out.println("tap '2' for MergeSort");
			
			ans2 = scan.nextInt();
			
			if(ans2 == 1) {
				
				QuickSort Qsort = new QuickSort();
				Qsort.quickSort(array, 0, length);
				sort.printArray(array);
				decision2 = true;
				
			}else if(ans2 == 2) {
				
				MergeSort Msort = new MergeSort();
				Msort.mergeSort(array, 0, length);
				sort.printArray(array);
				decision2 = true;
				
			}else {
				
				System.out.println("I don't understand your answer please retry again");
				decision2 = false;
				
			}
			
		}
		
/****************************************************************************/
	}
}
