package datastructure;

public class Stack {
//With Generic 
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sta <Integer> obj = new sta<Integer>();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		
		System.out.println("Elements in the stack : ");
		Node<Integer> current = obj.head;
		while(current!=null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println("Peek : " + obj.peep());
		System.out.println("pop : " + obj.pop());
		System.out.println("isempty : " + obj.isempty());
		System.out.println("size of stack : " + obj.size());
		
	}
}
	class Node<T>{
		T val;
		Node<T> next;
		
		Node(T val){
			this.val=val;
			this.next = null;
		}
	}
	  class sta<T>{
		 Node<T> head;
		 int size;
		sta(){
			this.head = null;
			this.size = 0;
			
		}
	
	
	public void push(T val) {
		Node<T> newnode = new Node<T>(val);
		if(head!=null) {
			newnode.next = head;
		}
		head = newnode;
		size++;
	}	
	public T peep() {
		if(isempty()) {
			return null;
		}
		return head.val;
	}
	
	public T pop() {
		if(isempty()) {
			return null;
		}
		T pooo = head.val;
		head = head.next;
		size--;
		return pooo;
	}
	
	public boolean isempty() {
		 return size==0;
	}
	public int size() {
		return size;
	}

}

*/
public static void main(String[] args) {
sta obj = new sta();
	obj.push(1);
	obj.push(2);
	obj.push(3);
	
	
	Node current = obj.head;
	while(current!=null) {
		System.out.println(current.val + " ");
		current = current.next;
	}
}

static class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
		this.next = null;
	}
}
 static class sta{
	int size;
	Node head;
sta(){
	this.size=0;
	this.head = null;
}

public void push(int val) {
	Node newnode = new Node(val);
	
		newnode.next = head;
	
	head = newnode;
	size++;
}
public int peep() {
	return head.val;
}

public int peek() {
	int pee = head.val;
	head = head.next;
	size--;
	return pee;
}
public int size() {
	return size;
}



}
}