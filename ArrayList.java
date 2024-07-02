package datastructure;

public class ArrayList<T>{
	T[] arr ;
	int size ;
	final int capacity = 10;
	
	ArrayList(){
		arr = (T[]) new Object[capacity];
		size = 0;
	}
	
	void add(T item) {
		arr[size++] = item;
	}
	
	public T get(int index) {
		return arr[index];
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		if(size==0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<size-1;i++) {
			sb.append(arr[i]).append(",");
		}
		sb.append(arr[size-1]).append("]");
		return sb.toString();
	}

	public static void main(String[] args) {

		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		System.out.print(li + " ");	
	}
	}




