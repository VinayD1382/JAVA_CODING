package javacode;
import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Number");
		int value = sc.nextInt();
		if(value%2==0) {
			System.out.println("The value is Even : " + value);
		}else {
			System.out.println("The value is Odd : " + value);
			
		}

	}

}
