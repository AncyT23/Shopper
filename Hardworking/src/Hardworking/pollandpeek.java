package Hardworking;

import java.util.PriorityQueue;

public class pollandpeek {

	public static void main(String[] args) {
		
		PriorityQueue l1=new PriorityQueue();
		l1.add(10);
		l1.add(100);
		l1.add(0);
		l1.add(500);
		l1.add(10);
		l1.add(15);
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		

	}

}
