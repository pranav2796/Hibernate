package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_INFORMATION")
public class StudentInfo {
	
	@Id @GeneratedValue
	private int ROLLNO;
	
	@Column(name="FULL_NAME")
	private String NAME;

	public int getRollNo() {
		return ROLLNO;
	}
	public void setRollNo(int ROLLNO) {
		this.ROLLNO = ROLLNO;
	}
	public String getName() {
		return NAME;
	}
	public void setName(String NAME) {
		this.NAME = NAME;
	}


}
