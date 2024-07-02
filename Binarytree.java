package datastructure;

public class Binarytree {
	
	static class Node {
		Node left;
		Node right;
		char value;
		
		Node(char value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root  = new Node('A');
		Node NodeA = new Node('B');
		Node NodeB = new Node('C');
		
		root.left = NodeA;
		root.right = NodeB;
		
		System.out.print(root.left.value);

	}

}
