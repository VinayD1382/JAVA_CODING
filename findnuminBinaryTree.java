package DSA;

public class findnuminBinaryTree {

	static class Node{
	       int data;
	       Node left;
	       Node right;
	       Node(int data){
	           this.data = data;
	           this.left = null;
	           this.right = null;
	       }
	        public static void inlineorder(Node root){
	           if(root==null){
	               return;
	           }
	           inlineorder(root.left);
	           System.out.print(root.data + " ");
	           inlineorder(root.right);
	        }
	        public static boolean findnum(Node root,int val){
	            if(root==null){
	                return false;
	            }
	            if(root.data==val){
	                return true;
	            }
	            boolean findleft = findnum(root.left ,val);
	            boolean findright = findnum(root.right , val);
	            return findleft || findright;
	        }
	       public static void main(String[] args){
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
	           inlineorder(root);
	           int val = 6;
	           boolean res = findnum(root,val);
	           System.out.println();
	          if(res==true){
	              System.out.println("The number " + val + " Found in the Binary tree" );
	          }else{
	              System.out.println("not found");
	          }
	       }
	 }


}
