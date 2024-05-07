package Hardworking;

import java.util.ArrayList;

public class remove1 {

	public static void main(String[] args) {
		ArrayList l1=new  ArrayList();
		l1.add("Mandya");
		l1.add("Tumkur");
		l1.add("Bengaluru");
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
		l1.remove("Tumkur");
		System.out.println(l1);

	}

}
