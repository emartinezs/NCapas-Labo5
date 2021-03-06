package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="student")
public class Student {
	
	@Id
	@Column(name="id_student")
	private Integer cStudent;
	
	@Column(name="s_name")
	private String sName;
	
	@Column(name="s_lname")
	private String lName;
	
	@Column(name="s_age")
	private Integer sAge;
	
	@Column(name="b_active")
	private Boolean bActive;
	
	public Student() {
		
	}
	
	public String getActiveDelegate() {
		if (this.bActive == null) {
			return "";
		}else {
			return bActive == true ? "Activo":"Inactivo";
		}
	}

	public Integer getcStudent() {
		return cStudent;
	}

	public void setcStudent(Integer cStudent) {
		this.cStudent = cStudent;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	public Boolean getbActive() {
		return bActive;
	}

	public void setbActive(Boolean bActive) {
		this.bActive = bActive;
	}
}
