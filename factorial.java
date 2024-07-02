package javacode;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
		long sum = 1;
		for(int i=1;i<=n;i++) {
			sum = sum*i;
		}
		System.out.println("The factorial of value " + n + "  is " + sum);
		sc.close();
	}

}
