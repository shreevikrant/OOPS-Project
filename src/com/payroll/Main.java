package com.payroll;

public class Main {

	   public static void main(String[] args) {
		
		        PayRoll p= new PayRoll();
		        PartTimeEmployee e1= new PartTimeEmployee(1, "Vibhansh", 45, 450);
		        FullTimeEmployee e2= new FullTimeEmployee(2, "Vibhansh", 70000);
		        PartTimeEmployee e3= new PartTimeEmployee(3, "Vikrant", 80, 700);
		        
		       p.addEmployee(e3);
		       p.addEmployee(e2);
		       p.addEmployee(e1);
		       p.displayEmployees();
		       p.removeEmployee(1);
		       p.displayEmployees();
	}
}
