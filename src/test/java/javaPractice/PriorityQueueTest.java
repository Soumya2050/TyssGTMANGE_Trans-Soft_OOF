package javaPractice;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueTest {
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
		PriorityQueue<Object> list1 = new PriorityQueue<>(list);
//		list.add(10);
//		list.add("Soumya");
//		list.add(20);
//		list.add(null);
//		list.add(10);
//		list.add("jena");
//		list.add(null);
//		list.add(10);
//		list.add("jena");
//		list.add(null);
//		list.add("Jyoti");
//		System.out.println(list);
		list1.poll();
		list1.peek();
		System.out.println(list1);
	}
}
