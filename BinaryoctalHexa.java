package CODINGG;
import java.util.Scanner;
public class BinaryoctalHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int decimal = sc.nextInt();
		
		String Binary = Integer.toBinaryString(decimal);
		String oct = Integer.toOctalString(decimal);
		String hex = Integer.toHexString(decimal);
		
		System.out.println("Binary Respresentation of Number is : " + Binary);
		System.out.println("Octagonal Respresentation of Number is : " + oct);
		System.out.println("Hexagonal Respresentation of Number is : " + hex);
		
	}

}
