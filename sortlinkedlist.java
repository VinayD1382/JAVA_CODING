package DSA;


public class sortlinkedlist {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static Node bubblesort(Node head) {
		if(head == null) {
			return null;
		}
		
			boolean swapped;
			Node lptr;
			Node ptr1 = head;
			do{
				swapped = false;
				lptr = null;
				
				while(ptr1.next!=null) {
					if(ptr1.next.data<ptr1.data) {
						int temp = ptr1.data;
						ptr1.data = ptr1.next.data;
						ptr1.next.data = temp;
						swapped=true;
					}
					ptr1 = ptr1.next;
				}
		}
			while(swapped);
		return head;
	}
	public static void traversal(Node head) {
		Node cur = head;
		while(cur!=null) {
			System.out.print(cur.data + " ->  ");
			cur = cur.next;
		}
		System.out.print("null");
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
				Node first = new Node(3);
				Node second = new Node(1);
				Node third = new Node(2);
				first.next = second;
				second.next = third;
				
				traversal(first);
				Node node1 = bubblesort(first);
				System.out.println();
				traversal(first);
		}

}
