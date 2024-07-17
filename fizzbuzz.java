package CODINGG;
import java.util.Scanner;
public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int val = sc.nextInt();
		sc.close();
		if(val%3==0 && val%5==0){
			System.out.println("FizzBuzz");
		}else if(val%5==0) {
			System.out.println("Buzz");
		}else if(val%3==0 ) {
			System.out.println("Fizz");
		}else {
			System.out.println("The number is " + val);
		}
	}

}
