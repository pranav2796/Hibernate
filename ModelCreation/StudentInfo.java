// Model class

package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_INFORMATION")
public class StudentInfo {
	
	@Id
	private int rollNo;
	private String Name;

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}


}
