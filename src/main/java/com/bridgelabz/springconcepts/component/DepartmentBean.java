package com.bridgelabz.springconcepts.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
	private String deptName;
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
