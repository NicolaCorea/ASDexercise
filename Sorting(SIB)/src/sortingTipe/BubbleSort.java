/**
 * 
 */
package sortingTipe;
import mainStart.StartSorting;

/**
 * @author Nicola_Corea
 *
 */

public class BubbleSort {
	
	StartSorting print = new StartSorting();

	public void bubbleSort(int[] item) { 
		/**
		 * scorro ogni elemento dell'array confrontandolo con l'elemento successivo
		 * finchè non ne trovo uno più piccolo, se lo trovo lo sostituisco
		 * con la posizione dell'elemento più grande
		 */
		
		for(int i = 0; i < item.length; i++) {
			
			System.out.println("");
			System.out.println("Scan array from: " + item[i]);
			
			for(int j = 0; j < item.length-1; j++) {
				
				System.out.println("Confront Element: " + item[j] + " with: " + item[j+1]);
				
				if (item[j] > item[j+1]) { // swap values
					
					System.out.println(item[j] + " is bigger than: " + item[j+1]);
					System.out.println("Swap: " + item[j+1] + " in position: " + j );
					
					int temp = item[j];
					item[j] = item[j+1];
					item[j+1] = temp;
					
					print.printArray(item);
					System.out.println("");
							
				}
			}
		}	
	}
}
