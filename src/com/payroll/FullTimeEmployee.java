package com.payroll;

public class FullTimeEmployee extends Employee{
	
	private double monthlysalary;
	
	public FullTimeEmployee(int id, String name, double monthlysalary) {
		super(id,name);
		this.monthlysalary=monthlysalary;		
	}
	
	

	@Override
	public double calculatesalary() {
		// TODO Auto-generated method stub
		return monthlysalary;
	}

}
