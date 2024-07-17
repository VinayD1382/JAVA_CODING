package CODINGG;
import java.util.Scanner;
public class numberornot {
	 public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the Value");
		    if(sc.hasNextInt()){
		    int input = sc.nextInt();
		    System.out.println("its a digit " + input);
		    }else{
		         System.out.println("its a not digit ");
		    }
		}
}
