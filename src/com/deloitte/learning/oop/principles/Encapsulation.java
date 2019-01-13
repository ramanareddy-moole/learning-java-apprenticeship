package com.deloitte.learning.oop.principles;

import java.text.SimpleDateFormat;
import java.util.Date;

// parent class
public class Encapsulation {
	public int i;
	private String company;
	private Date dateOfBirth;  

	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i > 10 && i < 20 ? i : 0;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			this.dateOfBirth = formatter.parse(dateOfBirth);
		} catch(Exception e) {
			
		}
	}
}
