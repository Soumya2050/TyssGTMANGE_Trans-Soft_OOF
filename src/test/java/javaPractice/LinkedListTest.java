package javaPractice;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList<>();
		list.add(10);
		list.add("Soumya");
		list.add(20);
		list.add(null);
		list.add(10);
		list.add("jena");
		list.add(null);
		list.add(10);
		list.add("jena");
		list.add(null);
		list.add("Jyoti");
		
		System.out.println(list);
	}
}
