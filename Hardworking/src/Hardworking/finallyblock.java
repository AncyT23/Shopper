package Hardworking;

public class finallyblock {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try {
			int i=1/0;
		} finally {
			System.out.println("heyyy i am finally");
	}
		System.out.println("main ends");
	}
}
