package com.payroll;

import java.util.ArrayList;

public class PayRoll {
	
	   ArrayList<Employee> employeeList= new ArrayList<>();;
	   
	   /*public PayRoll() {
		   employeeList=new ArrayList<>();
	   }*/

	
	   public void addEmployee(Employee employee) {
		   employeeList.add(employee);
	   }
       
	   public void removeEmployee(int id) {
		   
		      Employee employeeRemove=null;
		      
		    for(Employee emp:employeeList) {
		    	
		    	if(emp.getId()==id) {
		    		employeeRemove=emp;
		    		break;
		    	}
		    }
		    if(employeeRemove!=null) {
		    	employeeList.remove(employeeRemove);
		    }
	   }  
	   
	   public void displayEmployees() {
		   for(Employee emp: employeeList) {
			   
			   System.out.println(emp);
		   }
	   }
}
