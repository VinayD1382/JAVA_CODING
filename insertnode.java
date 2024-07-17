package DSA;

public class insertnode {
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
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.print("null");
		
	}
	public static Node insertnode(Node head,Node newnode,int position) {
		if(position == 1) {
			newnode.next = head;
			return newnode;
		}
		Node cur = head;
		for(int i=1;i<position-1 && cur!=null;i++) {
			cur = cur.next;
		}
		if(cur!=null) {
			newnode.next = cur.next ;
			cur.next = newnode;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		traversal(node1);
		System.out.println();
		Node newnode = new Node(10);
		node1 = insertnode(node1,newnode,3);
		traversal(node1);
	}

}
