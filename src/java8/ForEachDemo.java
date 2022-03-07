package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("1","2","3","4","5");
		
		list.stream().forEach(s -> System.out.println(s));
		
		list.stream().filter(s -> s.startsWith("1")).forEach(s -> System.out.println(s));
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		
		map.forEach((key,value) -> System.out.println(key+":"+value));
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
		map.entrySet().stream().filter(key -> key.getKey()%2==0).forEach(obj -> System.out.println(obj));
	}

}
