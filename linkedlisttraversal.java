package DSA;

public class linkedlisttraversal {
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
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
			Node first = new Node(1);
			Node second = new Node(2);
			Node third = new Node(3);
			first.next = second;
			second.next = third;
			
			traversal(first);
	}

}
