package CODINGG;

public class simpleregularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[0-9]+"; // 2 cheks in [0-9] , + is then 3 checks in [0-9],+ 5 in [0-9] , [0-9],[0-9],[0-9].... in search of number.
		String str1 = "23569874";
			System.out.println("Str1 is found in str : " + str1.matches(str));

	}

}
