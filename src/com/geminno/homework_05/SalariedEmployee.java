package com.geminno.homework_05;

/**
 * Employee的子类，拿固定工资的员工
 * 
 * @author Song
 *
 */
public class SalariedEmployee extends Employee{
     private double monthSalary;//拿固定工资的月薪
     
     
     
     public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SalariedEmployee(String name, int employeeMonth, double salary) {
		super(name, employeeMonth, salary);
		// TODO Auto-generated constructor stub
	}



	public SalariedEmployee(double monthSalary) {
		super();
		this.monthSalary = monthSalary;
	}



	public double getMonthSalary() {
		return monthSalary;
	}



	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}



	public double getSalary(int month){
		return monthSalary+super.getSalary(month);
    	 
     }
}
