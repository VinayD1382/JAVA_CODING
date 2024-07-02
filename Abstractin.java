package javacode;


	
	abstract class Abs{
		public abstract void color();
	}
	
	class Pig extends Abs{
		public void color() {
			System.out.println("Black");
		}
	}
	public class Main{
		public static void main(String[] args) {
			Pig obj = new Pig();
			obj.color();
		}
	}
	
