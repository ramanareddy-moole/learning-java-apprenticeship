package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
//		List<String> companies = new ArrayList<>(); // diamond syntax
//		companies.add("Deloitte");
//		companies.add("Deloitte2");
//		companies.add("Deloitte3");
//		companies.add("Deloitte4");
//		companies.add("Deloitte5");
//		companies.add("Deloitte6");
//		
//		List<String> companies2 = new ArrayList<>();
//		companies2.add("Accenture");
//		companies2.add("Accenture2");
//		companies2.add("Accenture3");
//		companies2.add("Accenture4");
//		
//		// System.out.println(companies.get(3));
////		System.out.println(companies.size());
//		companies.addAll(companies2);
//		
//		String[] companyArray = new String[companies.size()];
//		
////		System.out.println(companies.toArray(companyArray)); // this should print the merged elements of companies and companies2 lists
//		
////		for(String str: companyArray) {
////			System.out.println("Array :" + str);
////		}
//		
//		Arrays.asList(companyArray); // converting a list object into an array
		
		
		//System.out.println(companies);

		// avoid any kind of duplicates, Set is the preferred datatype 
		// allows only unique elements to be added if you add any duplicates it will override with the existing elements
		// This set doesn't main any order
//		Set<String> companySet = new HashSet<>();
//		companySet.add("Deloitte");
//		companySet.add("Deloitte1");
//		companySet.add("Deloitte2");
//		companySet.add("Deloitte3");
//		companySet.add("Deloitte4");
//		companySet.add("Deloitte5");
//		companySet.add("Deloitte6");
//		companySet.add("Deloitte7");
//		
//		//System.out.println(companySet);
//		
//		// maintains the order of ascending based on the data added
//		Set<String> companyTreeSet = new TreeSet<>();
//		companyTreeSet.add("Deloitte");
//		companyTreeSet.add("Accenture");
//		companyTreeSet.add("Infosys");
//		companyTreeSet.add("Wipro");
//		companyTreeSet.add("TCS");
//		companyTreeSet.add("Google");
//		System.out.println(companyTreeSet);
//		
//		// this will maintain the order of insertion along with not allowing the duplicates 
//		Set<String> cLinkedHashSet = new LinkedHashSet<>();
//		cLinkedHashSet.add("Deloitte");
//		cLinkedHashSet.add("Deloitte2");
//		cLinkedHashSet.add("Deloitte3");
//		cLinkedHashSet.add("Deloitte");
//		cLinkedHashSet.add("Deloitte4");
//		cLinkedHashSet.add("Deloitte5");
//		cLinkedHashSet.add("Deloitte7");
//		
//		System.out.println(cLinkedHashSet);
//
//		String[] str = new String[7];
//		str[0] = "Deloitte";
//		str[1] = "Deloitte";
//		str[2] = "Deloitte";
//		str[3] = "Deloitte";
//		str[4] = "Deloitte";
//		str[5] = "Deloitte";
//		str[6] = "Deloitte";
		
		// System.out.println(str[2]);
		
		// Map<String, String> companyLocationMap = new HashMap<>();
		
		// Diamond syntax
		TreeSet<String> namesOfEmployees = new TreeSet<>(java.util.Collections.reverseOrder());
		
		namesOfEmployees.add("Rahul");
		namesOfEmployees.add("Ambika");
		namesOfEmployees.add("Fasi");
		namesOfEmployees.add("Ramana");
		namesOfEmployees.add("Joseph");
		namesOfEmployees.add("Suman");
		
//		System.out.println(namesOfEmployees);
		
		// int i = 10;
		
		// wrapper classes for all the primitive data types
		//Integer intValue = 10;
		//Double 
		//Byte
		//Character
		
		TreeSet<Integer> salaryOfEmployees = new TreeSet<>();
		salaryOfEmployees.add(873422363);
		salaryOfEmployees.add(78343);
		salaryOfEmployees.add(76335443);
		salaryOfEmployees.add(76334343);
		salaryOfEmployees.add(763453343);
		salaryOfEmployees.add(7634233);
		salaryOfEmployees.add(76344563);
//		System.out.println(salaryOfEmployees);
		
		//list = [{"name": "fasi", "salary": "2731232342"}, {"name": "", "salary": ""}];
		
		//List<Map<String, String>>
		
		Map<String, String> names = new HashMap<>();
		names.put("Fasi", "87234");
		names.put("Rahul", "72342");
		names.put("Ambika", "786345");
		names.put("Ambika", null);
		names.put("Ramana", "876345");
		names.put("Ramana", null);
		names.put(null, "jkhsdfuishd");
		
		//System.out.println(names);
		
		Map<String, Employee> employeeMap = new HashMap<>();
		
		// Employee e = new Employee("jhsdfa", "jhwerwe");
		
		employeeMap.put("625342", new Employee("Fasiullah", "S"));
		employeeMap.put("762342", new Employee("Rahul", "Kishen D"));
		employeeMap.put("762534", new Employee("Ambika", "Bhat"));
		employeeMap.put("873455", new Employee("Ramana Reddy", "Moole"));
		
		System.out.println(employeeMap);
		
		System.out.println("Iterating through Map using EntrySet method");
		for(Map.Entry<String, Employee> entry: employeeMap.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue());
		}
		
		
		System.out.println("Iterating through Map using KeySet");
		Set<String> keys = employeeMap.keySet();
		for(String key: keys) {
			System.out.println("Key :" + key + " Value :" + employeeMap.get(key));
		}
		
		List<String> employeeIds = new ArrayList<>();
		
		employeeIds.addAll(Arrays.asList("762534", "762342"));
		
		for(String str: employeeIds) {
			System.out.println(str + " " + employeeMap.get(str));
		}
		
		// Comparator and Comparable
		
		//TreeSet<Employee> employeeSorted = new TreeSet<>(java.util.Collections.reverseOrder());
		
		List<Employee> employeeSorted = new ArrayList<>();
		employeeSorted.add(new Employee("Fasiullah", "S"));
		employeeSorted.add(new Employee("Rahul", "Kishen D"));
		employeeSorted.add(new Employee("Ambika", "Bhat"));
		employeeSorted.add(new Employee("Ramana Reddy", "Moole"));
		
		java.util.Collections.sort(employeeSorted);
		System.out.println(employeeSorted);
		
		
	}
} 

/**
 * 
 * @author rmoole
 * Encapsulation
 * POJO - Plain Old Java Object
 *
 */
class Employee implements Comparable<Employee> {
	
	// constructor
	public Employee(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return this.firstName + "|" + this.lastName;
	}
	
	@Override
	public int compareTo(Employee employee) {
		return this.getLastName().compareTo(employee.getLastName());
	}
}
