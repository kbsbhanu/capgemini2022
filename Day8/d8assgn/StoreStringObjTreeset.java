package com.demo.d8assgn;

import java.util.Collections;
import java.util.Iterator;

import java.util.TreeSet;

public class StoreStringObjTreeset {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Bhanu");
		set.add("Jaanu");
		set.add("Vaishu");
		set.add("Seegee");
		
		String query = "Jaanu";
		boolean result = false;
		  
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}



}