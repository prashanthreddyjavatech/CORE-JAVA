package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(6);
		
		List<Integer> sortedList1=list.stream().sorted().collect(Collectors.toList());
		List<Integer> sortedList2=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 
		System.out.println(sortedList2);
	}

}
