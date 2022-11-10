package com.collection;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;

	public class HashMapDemo {
		
		
		public static void main(String[] args) {
			
			
			
			Map<Integer ,String> map=new HashMap();
			
			map.put(1,"Suraj");
			map.put(5,"Mahesh");
			map.put(4,"Vijay");
			map.put(3,"Yogesh");
			map.put(2,"Rohit");
			
			
			Set<Integer> set=map.keySet();	
			
			  Iterator<Integer> itr=set.iterator();
			
			
			  
			  while(itr.hasNext()) {
				  int i=itr.next();
				  System.out.println("Key>>" +i);
	System.out.println("Value>>" +map.get(i));			  
				  
			  }
		
	}
}
