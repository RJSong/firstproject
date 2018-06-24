package com.geminno.homework_05;
/**
 * 	Employee�����࣬��Сʱ�ù��ʵ�Ա����
	���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
	ÿ�¹�������160Сʱ�Ĳ��ְ���1.5�����ʷ��š�
	
	
 * @author Song
 *
 */
public class HourlyEmployee extends Employee {
     private double hourSalary;//ʱн
     private int hour;//ÿ�¹�����Сʱ��
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
    	 //����160Сʱ�����  
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