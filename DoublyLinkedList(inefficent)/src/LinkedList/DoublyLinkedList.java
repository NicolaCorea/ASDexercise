/**
 * 
 */
package LinkedList;

//import LinkedList.DoublyLinkedListImpl;
/**
 * @author nicol
 *
 */
public class DoublyLinkedList {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoublyLinkedListImpl<Integer> list = new DoublyLinkedListImpl<Integer>();
		int x, y, z, t;
		
		x = 1;
		y = 5;
		z = 150;
		t = 500;
		
		//int[] myarray;	
		int[] numbers = new int[] {x, y, z, t};
		
		System.out.println("the length of array is: " + numbers.length);
		
		for(int i = 0; i< numbers.length; i++) {
			
			int n;
			n= numbers[i];
			System.out.println("the number at position: " + "(" + i + ")" + " is: " + n);
			
		}
		
		list.addFirst(y);
		list.addFirst(x);
		list.addLast(z);
		list.addLast(t);
		list.iterateForward();
		list.iterateBackward();
		/*
		myarray = new int[list.size()];
		
		for(int i = 0; i< myarray.length; i++) {
			System.out.println(myarray[i]);
			
		}*/
		
	}

}
