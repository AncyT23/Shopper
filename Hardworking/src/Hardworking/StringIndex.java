package Hardworking;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		String s1="amma";
		try {
			System.out.println(s1.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("handled");
		}
System.out.println("main ends");
	}

}
