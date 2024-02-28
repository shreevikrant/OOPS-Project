package com.payroll;

public abstract class Employee {

	   private int id;
	   private String name;
	   
	   public Employee(int id, String name) {
		   this.id=id;
		   this.name=name;
	   }
	   
	   public String getName() {
		   return name;
	   }
	   public int getId() {
		   return id;
	   }
	   
	   public abstract double calculatesalary();
	   
	   public String toString() {
		   
		   return "Employee[id : "+id+"name : "+name+"salary : "+calculatesalary()+"]";
	   }
	   
}
