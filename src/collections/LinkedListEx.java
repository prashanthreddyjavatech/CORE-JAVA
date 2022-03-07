package collections;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add(2, "oneplus");
		LinkedList<String> list2 =new LinkedList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		list.addAll(list2);
		System.out.println(list);
		System.out.println(list2);
	}

}
