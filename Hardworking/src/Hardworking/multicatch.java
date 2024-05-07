package Hardworking;

public class multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		try {
			int i=1/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("handled");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("its caught");
		}
System.out.println("Main ends"); 
	}

}
