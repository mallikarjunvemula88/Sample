package com.app.model;

public class Employee {
	private int eid;
	private String eName;
	private String eSal;
	public Employee() {
		super();
	}
	
	public Employee(int eid) {
		super();
		this.eid = eid;
	}

	public Employee(int eid, String eName, String eSal) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eSal = eSal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteSal() {
		return eSal;
	}

	public void seteSal(String eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eSal=" + eSal + "]";
	}
	
	

}
