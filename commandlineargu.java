package oopsjava;

public class commandlineargu{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        if(args.length != 2) {
		            System.out.println("Usage: java MyProgram <arg1> <arg2>");
		            return;
		        }

		        String arg1 = args[0];
		        String arg2 = args[1];

		        // Do something with arg1 and arg2
		        System.out.println(arg1 + " " + arg2);
		    }
		

	}


