package com.Swagger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "Details of the Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "Student Id", name = "studId", required = true, value = "studId")
	private int studeId;

	@ApiModelProperty(notes = "Name of the student", name = "sname", required = true, value = "sname")
	private String sname;

	@ApiModelProperty(notes = "Address of the student", name = "addr", required = true, value = "addr")
	private String addr;

	public Student() {
		super();
	}

	public Student(int studeId, String sname, String addr) {
		super();
		this.studeId = studeId;
		this.sname = sname;
		this.addr = addr;
	}

	public int getStudeId() {
		return studeId;
	}

	public void setStudeId(int studeId) {
		this.studeId = studeId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
