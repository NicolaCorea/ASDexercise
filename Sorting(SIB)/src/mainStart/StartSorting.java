/**
 * 
 */
package mainStart;
import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;
//import java.util.concurrent.TimeUnit;
import sortingTipe.SelectionSort;
import sortingTipe.InsertionSort;
import sortingTipe.BubbleSort;
/**
 * @author Nicola_Corea
 *
 */
public class StartSorting {

	int[] array = {52, 4, 73, 8, 2, 1, 99, 5, 3, 3, 7, 9, 8, 56, 37, 42};
	private static Scanner scan;
	
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
		
		/*******************************************************************/
		StartSorting arr = new StartSorting();
		SelectionSort selSort = new SelectionSort();
		InsertionSort insSort = new InsertionSort();
		BubbleSort bubSort = new BubbleSort();
		/*******************************************************************/
		
		/*
		for(int i = 0; i< arr.array.length; i++) {
			int x = (int) Math.random()*100000;
			arr.array[i] = x;
		}
		*/
		
		/*******************************************************************/
		int[] t = Arrays.copyOf(arr.array, arr.array.length);
		boolean decision = false;
		scan = new Scanner(System.in);
		
		while(decision == false) {
			System.out.println("your unsorted array is:");
			arr.printArray(t); System.out.println("");
			System.out.println("you want to continue? (Y/N)");
			char ans = scan.next().charAt(0);
			if(ans == 'y') {
				decision = true;
			}else if(ans =='n') {
				System.out.println("bye bye");
				System.exit(0);
			}else {
				decision = false;
			}
		}
		
		/*******************************************************************/
		int[] x = Arrays.copyOf(arr.array, arr.array.length);
		int[] y = Arrays.copyOf(arr.array, arr.array.length);
		int[] z = Arrays.copyOf(arr.array, arr.array.length);
		//int[] t = arr.array; this instruction create a pointer to array not copy them
		/*******************************************************************/
		
		System.out.println("Unsorted Array");
		arr.printArray(x);
		long startSelection = System.nanoTime();
		selSort.selectionSort(x); 
		long endSelection = System.nanoTime();
		long timeSelection = endSelection - startSelection;
		System.out.println("");
		System.out.println("***************************************");
		System.out.println("Array Sorted with Selection sort algorithm");
		arr.printArray(x);System.out.println("");
		System.out.println("***************************************");
		
		/*******************************************************************/
		
		System.out.println("");
		System.out.println("Unsorted Array");
		arr.printArray(y);
		long startInsertion = System.nanoTime();
		insSort.insertionSort(y);
		long endInsertion = System.nanoTime();
		long timeInsertion = endInsertion - startInsertion;
		System.out.println("");
		System.out.println("***************************************");
		System.out.println("Array Sorted with Insertion sort algorithm");
		arr.printArray(y);System.out.println("");
		System.out.println("***************************************");
		
		/*******************************************************************/
		
		System.out.println("");
		System.out.println("Unsorted Array");
		arr.printArray(z);
		long startBubble = System.nanoTime();
		bubSort.bubbleSort(z);
		long endBubble = System.nanoTime();
		long timeBubble = endBubble - startBubble;
		System.out.println("");
		System.out.println("***************************************");
		System.out.println("Array Sorted with Bubble sort algorithm");
		arr.printArray(z);System.out.println("");
		System.out.println("***************************************");
		
		/*******************************************************************/
		System.out.println("Selection sort: commit work in: " + timeSelection);
		System.out.println("Insertion sort: commit work in: " + timeInsertion);
		System.out.println("Bubble sort:    commit work in: " + timeBubble);
	}
}
