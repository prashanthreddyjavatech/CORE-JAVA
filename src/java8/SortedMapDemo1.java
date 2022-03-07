package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortedMapDemo1 {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 3);
		map.put("three", 2);
		map.put("four", 4);
		map.put("five", 5);
		
		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, (o1,o2) -> o1.getKey().compareTo(o2.getKey()));
		
		for(Entry<String,Integer> entries : list) {
			System.out.println(entries.getKey()+":"+entries.getValue());
		}
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
	}
}
