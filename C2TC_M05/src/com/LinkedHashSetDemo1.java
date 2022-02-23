package com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
	
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		
		lhs.add("One");    
		lhs.add("Two");    
		lhs.add("Three");   
		lhs.add("Four");  
		lhs.add("Five");  
		lhs.add("Five"); 
		lhs.add("Six"); 
		lhs.add("Six"); 
		lhs.add("Six"); 
		
		
		
		Iterator i=lhs.iterator();
		while(i.hasNext())
		
		{
			Object o=i.next();
			System.out.println(o);
		}
		
	}

}
