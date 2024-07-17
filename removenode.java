package DSA;

public class removenode {
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
		public static Node deletenode(Node head,Node del) {
			if(del == head) {
				return head.next;
			}
			Node cur = head;
			cur.next.next = cur.next.next.next;
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
		System.out.println("Delete a node");
		deletenode(node1,node3);
		traversal(node1);
		
	}

}
