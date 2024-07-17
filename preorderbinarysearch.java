package DSA;

public class preorderbinarysearch {
static class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public static void preorder(Node root) {
	if(root==null) {
		return;
	}
  System.out.print(root.data + " ");
  preorder(root.left);
  preorder(root.right);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		preorder(root);
	}

}
