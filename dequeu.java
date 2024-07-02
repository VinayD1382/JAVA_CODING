package datastructure;

public class dequeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deq obj = new deq();
		obj.enqueee(1);
		obj.enqueee(2);
		obj.enqueee(3);
		
		Node current = obj.front;
		while(current!=null) {
			System.out.println(current.val + " ");
			current = current.next;
		}
		
		System.out.println("dequeue : " + obj.deqeue());
		
		Node current1 = obj.front;
		while(current1!=null) {
			System.out.println(current1.val + " ");
			current1 = current1.next;
		}
		
		System.out.println(obj.peek());
		

	}
	
	static  class Node{
		Node next;
		int val;
		
		Node(int val){
			this.next=null;
			this.val =val;
		}
	}
	static class deq{
		Node front;
		Node rare;
		int size;
		deq(){
			this.front=null;
			this.rare=null;
			this.size=0;
		}
		
		  // when newnode 2 came and that will be this.1.next value
       
    	   public void enqueee(int val) {
    		    Node newNode = new Node(val); // Create a new node with the given value (e.g., newNode = 1)
    		    if (this.rare == null) {  // Check if the queue is empty
    		        // If the queue is empty, set both front and rear to point to the new node
    		        this.rare = this.front = newNode;  // Set front and rare to newNode (e.g., front = 1 and rare = 1)
    		        size++; // Increase the size of the queue to account for the new node
    		    }
    		    // If the queue is not empty, simply make rare point to the new node
    		    this.rare.next = newNode; // Update rare to point to the new node (e.g., rare = 2)
    		    this.rare = newNode; 
    		    size++; // Increase the size of the queue to account for the new node
    		}

		
		public int deqeue() {
			Node defr = this.front; // take a variable value for it
			this.front = defr.next; // aassign next front node 
			size--;
			return defr.val;
			
		}
		
		public int peek() {
			return this.front.val;
		}
	}

}
