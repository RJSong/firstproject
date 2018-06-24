package com.geminno.homework_05;
/**
 * 	Employee的子类，按小时拿工资的员工，
	属性：每小时的工资、每月工作的小时数
	每月工作超出160小时的部分按照1.5倍工资发放。
	
	
 * @author Song
 *
 */
public class HourlyEmployee extends Employee {
     private double hourSalary;//时薪
     private int hour;//每月工作的小时数
     private static double salary;

     
     public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HourlyEmployee(String name, int employeeMonth, double salary) {
		super(name, employeeMonth, salary);
		// TODO Auto-generated constructor stub
	}



	public HourlyEmployee(String name, int employeeMonth,double hourSalary, int hour) {
		super(name, employeeMonth, salary);
		this.hourSalary = hourSalary;
		this.hour = hour;
	}



	public double getSalary(int month){
    	 //大于160小时的情况  
         if (hour > 160)  
         {  
            
            salary=(double) (hourSalary * 160 + (hour - 160) * hourSalary * 1.5   
                     + super.getSalary(month));  
            return salary;
         }  
         else  
         {  
             salary= hourSalary * hour + super.getSalary(month);  
             return salary;
         }
    }
}