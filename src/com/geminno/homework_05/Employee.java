package com.geminno.homework_05;
/**
 *  Employee：这是所有员工总的父类，
	属性：员工的姓名,员工的生日。
	方法：getSalary(int month) 
	根据参数月份来确定工资，
	如果该月员工过生日，则公司会额外奖励100元。

 * @author Song
 *
 */
public class Employee {
    private String name;//员工姓名
    private int employeeMonth;//员工的生日
    private double salary;//员工薪资
    
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int employeeMonth, double salary) {
		super();
		this.name = name;
		this.employeeMonth = employeeMonth;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeMonth() {
		return employeeMonth;
	}


	public void setEmployeeMonth(int employeeMonth) {
		this.employeeMonth = employeeMonth;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getSalary(int month){
		
		if(this.employeeMonth==month){
			salary=salary+100;
		}
		return salary;
		
	}
    
}
