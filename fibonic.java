package datastructure;

public class fibonic {
static int count =1;

	public static void fiboni(int a,int b) {
		if(count<19) {
			int c = a+b;
		System.out.println(c);
		a=b;
		b=c;
		count++;
		fiboni(a,b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int a =0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<19;i++) {
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}*/   
		System.out.println(0);
		System.out.println(1);
		fiboni(0,1);
	}
}
