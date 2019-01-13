package com.delotite.learning.io.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectStreamExample {
//	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.setFirstName("Rahul");
//		emp.setLastName("Kishen");
//		emp.setCompany("Deloitte Consulting India Pvt Ltd");
//		System.out.println(emp);
//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("employee.obj")));){
//			oos.writeObject(emp);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("employee.obj")))) {
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 78342376345L;
	
	private String firstName;
	private String lastName;
	private transient String company; 
	
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
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return this.firstName + "|" + this.lastName + "|" + this.company;
	}
}
