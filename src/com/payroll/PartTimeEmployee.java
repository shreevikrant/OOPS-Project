package com.payroll;

public class PartTimeEmployee extends Employee {

	  private int workedHours;
	  private double hourlyRate;
	  
	  public PartTimeEmployee(int id, String name, int workedHours, double hourlyRate) {
		  super(id,name);
		  this.workedHours=workedHours;
		  this.hourlyRate=hourlyRate;
		  
	  }

	@Override
	public double calculatesalary() {
		// TODO Auto-generated method stub
		return hourlyRate*workedHours;
	}
	  
}
