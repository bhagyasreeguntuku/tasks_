package com.src;

public class StudentEx {
	int stuId;
	String stuName;
	String stuNo;
	String stuDepartment;
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuNo=" + stuNo + ", stuDepartment="
				+ stuDepartment + "]";
	}

	public StudentEx(int stuId, String stuName, String stuNo, String stuDepartment) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuNo = stuNo;
		this.stuDepartment = stuDepartment;
	}
	
	
}
