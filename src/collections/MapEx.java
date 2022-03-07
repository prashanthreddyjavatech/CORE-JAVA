package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	 public static void main(String args[]){  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(1,"one");  
		  map.put(2,"two");  
		  map.put(3,"three");  
		  Set set=map.entrySet();
		   Iterator itr=set.iterator(); 
		   while(itr.hasNext()) {
			   Map.Entry entry=(Map.Entry)itr.next();
			   System.out.println(entry.getKey()+":"+entry.getValue());
		   }
		   
		 
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){
		  System.out.println(m.getKey()+" "+m.getValue()); }
		  
		 }  
	 
	

}
