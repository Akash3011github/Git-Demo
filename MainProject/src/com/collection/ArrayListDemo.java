package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> list=new  ArrayList<String>();
		
	list.add("Akash");
	list.add("Shubhum");
	list.add("Tejas");
	list.add("Pravin");
		
	
	   Iterator itr=list.iterator();
	   System.out.println("Students are >>");
	   while(itr.hasNext()) {
		   
		   
		   
		   System.out.println(itr.next());
	   }
		
	}
}