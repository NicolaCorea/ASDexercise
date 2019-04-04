/**
 * 
 */
package LinkedList;

/**
 * @author Nicola_Corea
 *
 */
public class List {
	
	private class Pos{ //position class
		Object v;
		Pos succ;
		Pos pred;
		
		public Pos(Object v){
			
			succ = pred = null;
			this.v = v;
			
		}
	
	}
	
	private Pos head; //first element of the list
	private Pos tail; //last element of the list
	
	public List() {
		head = tail = null;
	}
	
	//list's methods
	
	public Pos insert(Pos pos, Object v) {
		
		Pos t = new Pos(v);
		
		if(head == null) {
			
			head = tail = t; //insert into a empty list
			
		} else if(pos == null) {
			
			t.pred = tail; //
			tail.succ = t; //
			tail = t; //insert at the end of the list
			
		} else {
			
			t.pred = pos.pred;//
			
			if(t.pred != null) {
				
				t.pred.succ = t;
				
			} else {
				
				head = t;
				t.succ = pos;
				pos.pred = t;
				
			}
			
		}
		
		return t;
	}
	
	public void remove(Pos pos) {
		
		if(pos.pred == null) {
			
			head = pos.succ;
			
		} else {
			
			pos.pred.succ = pos.succ;
		}
		
		if(pos.succ == null) {
			
			tail = pos.pred;
			
		} else {
			
			pos.succ.pred = pos.pred;
			
		}
		
	}
	
	public void iterateForward() {
		
		System.out.println("iterating forward");
		
		Pos tmp = head;
		
		while (tmp != null) {
			System.out.println(tmp.v);
			
			tmp = tmp.succ;
		}
		
	}
	
	public void iterateBackward() {
		
		System.out.println("iterating forward");
		
		Pos tmp = tail;
		
		while (tmp != null) {
			System.out.println(tmp.v);
			
			tmp = tmp.pred;
		}
		
	}
	
	public Pos head() {return head;}
	public Pos tail() {return tail;}
	public Pos next(Pos pos) {return (pos != null ? pos.succ : null);}
	public Pos prev(Pos pos) {return (pos != null ? pos.pred : null);}
	public boolean finished(Pos pos) {return pos == null;}
	public boolean isEmpty() {return head == null;}
	public Object read(Pos pos) {return pos.v;}
	public void write(Pos pos, Object v) {pos.v = v;}

}
