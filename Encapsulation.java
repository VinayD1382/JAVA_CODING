package oopsjava;
import java.util.Scanner;

public class Encapsulation {
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setuser("VINAY");
		obj.setpassword("vinay@123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id : ");
		String uuser = sc.nextLine();
		System.out.println("Enter the Password : ");
		String pass = sc.nextLine();
		
		if(obj.en(uuser,pass)) {
			System.out.println("WELCOME");
		}else {
			System.out.println("Enter the details correctly : ");
		}
		sc.close();
	}
	private String user;
	private String password;
	
	public void setuser(String user) {
		this.user = user;
	}
	public String getuser() {
		return user;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getpassword() {
		return password;
	}
	
	public boolean en(String uuser,String pass) {
		return user.equals(uuser) && password.equals(pass);
	}
	

}