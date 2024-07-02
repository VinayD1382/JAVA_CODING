package oopsjava;

public class inherit {
	public static void main(String[] args){
		dog obj = new dog();
		obj.sound();
		obj.snd();
	}
	

}
class Animal{
	public void sound() {
		System.out.println("Annnnnn");
	}
		public void snd() {
			System.out.println("Cnnnnnn");
	}
}

class dog extends Animal{
	public void sound() {
		System.out.println("bowwwww");
	}
}
