package javacode;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Word");
		String str = sc.nextLine();
		boolean res = palindre(str);
		if(res==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palinrome");
		}
		
	}
	public static boolean palindre(String str) {
		int left = 0;
		int right = str.length() -1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}

}
