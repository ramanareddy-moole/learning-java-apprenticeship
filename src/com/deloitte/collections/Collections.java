package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	// group of elements of same - 
	
	public static void main(String[] args) {
		
		// Throwable -> Exception and Error
		
		// Collection is the top of the tree
		
		// List, Set, ArrayList, HashSet, TreeSet, LinkedHashSet, 
		
		// Map, HashMap, LinkedHashMap, TreeMap, Hashtable 
		// a list can be defined as growable array
		// maintains the insertion order
		// the elements added to the list can be retrieved using an index
		List<String> companies = new ArrayList<>(); // diamond syntax
		companies.add("Deloitte");
		companies.add("Deloitte2");
		companies.add("Deloitte3");
		companies.add("Deloitte4");
		companies.add("Deloitte5");
		companies.add("Deloitte6");
		
		List<String> companies2 = new ArrayList<>();
		companies2.add("Accenture");
		companies2.add("Accenture2");
		companies2.add("Accenture3");
		companies2.add("Accenture4");
		
		// System.out.println(companies.get(3));
//		System.out.println(companies.size());
		companies.addAll(companies2);
		
		String[] companyArray = new String[companies.size()];
		
//		System.out.println(companies.toArray(companyArray)); // this should print the merged elements of companies and companies2 lists
		
//		for(String str: companyArray) {
//			System.out.println("Array :" + str);
//		}
		
		Arrays.asList(companyArray); // converting a list object into an array
		
		
		//System.out.println(companies);

		// avoid any kind of duplicates, Set is the preferred datatype 
		// allows only unique elements to be added if you add any duplicates it will override with the existing elements
		// This set doesn't main any order
		Set<String> companySet = new HashSet<>();
		companySet.add("Deloitte");
		companySet.add("Deloitte1");
		companySet.add("Deloitte2");
		companySet.add("Deloitte3");
		companySet.add("Deloitte4");
		companySet.add("Deloitte5");
		companySet.add("Deloitte6");
		companySet.add("Deloitte7");
		
		//System.out.println(companySet);
		
		// maintains the order of ascending based on the data added
		Set<String> companyTreeSet = new TreeSet<>();
		companyTreeSet.add("Deloitte");
		companyTreeSet.add("Accenture");
		companyTreeSet.add("Infosys");
		companyTreeSet.add("Wipro");
		companyTreeSet.add("TCS");
		companyTreeSet.add("Google");
		System.out.println(companyTreeSet);
		
		// this will maintain the order of insertion along with not allowing the duplicates 
		Set<String> cLinkedHashSet = new LinkedHashSet<>();
		cLinkedHashSet.add("Deloitte");
		cLinkedHashSet.add("Deloitte2");
		cLinkedHashSet.add("Deloitte3");
		cLinkedHashSet.add("Deloitte");
		cLinkedHashSet.add("Deloitte4");
		cLinkedHashSet.add("Deloitte5");
		cLinkedHashSet.add("Deloitte7");
		
		System.out.println(cLinkedHashSet);

		String[] str = new String[7];
		str[0] = "Deloitte";
		str[1] = "Deloitte";
		str[2] = "Deloitte";
		str[3] = "Deloitte";
		str[4] = "Deloitte";
		str[5] = "Deloitte";
		str[6] = "Deloitte";
		
		// System.out.println(str[2]);
		
		// Map<String, String> companyLocationMap = new HashMap<>();
	}
}
