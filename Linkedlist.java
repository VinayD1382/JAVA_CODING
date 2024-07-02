package datastructure;

public class Linkedlist {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node firstnode = new Node(3);
		Node secnode = new Node(4);
		Node thinode = new Node(5);
		Node fournode = new Node(6);
		Node fivenode = new Node(8);
		
		firstnode.next = secnode;
		secnode.next = thinode;
		thinode.next = fournode;
		fournode.next = fivenode;
		
		Node currentnode = firstnode;
		while(currentnode!=null) {
			System.out.println(currentnode.data + " ");
		currentnode = currentnode.next;
	}
	System.out.println("null");
}
}
