/**
 * 
 */
package LinkedList;

/**
 * @author Nicola_Corea
 *
 */
public class DoubleLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new List();
		
		int x, y, z, t;
		
		x = 1;
		y = 5;
		z = 150;
		t = 500;
			
		int[] numbers = new int[] {x, y, z, t};
		
		System.out.println("the length of array is: " + numbers.length);
		
		for(int i = 0; i< numbers.length; i++) {
			
			int n;
			n= numbers[i];
			System.out.println("the number at position: " + "(" + i + ")" + " is: " + n);
			
		}
		
		list.insert(null, x);
		list.insert(null, y);
		list.iterateForward();
		list.remove(list.head());
		list.iterateForward();
		list.remove(list.head());
		list.iterateForward();
		list.insert(null, x);
		list.insert(null, y);
		list.insert(null, z);
		list.insert(null, t);
		list.iterateForward();
	}

}
