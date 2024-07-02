package javacode;
import java.util.Arrays;
import java.util.Scanner;
public class ANagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the 2st String : ");
		String str2 = sc.nextLine();
		
		boolean res = anagram(str1,str2);
		if(res==true) {
			System.out.println("The Given Words are Anagrams ");
		}else {
			System.out.println("Not Anagram");
		}
		sc.close();
	}
	
	public static boolean anagram(String str1,String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}

}
