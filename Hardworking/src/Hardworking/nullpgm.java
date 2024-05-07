package Hardworking;

public class nullpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		nullpgm s1=new nullpgm();
		s1=null;
		try {
			System.out.println(s1.hashCode());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("handled");
		}
System.out.println("main ends");
	}

}
