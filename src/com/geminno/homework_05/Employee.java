package com.geminno.homework_05;
/**
 *  Employee����������Ա���ܵĸ��࣬
	���ԣ�Ա��������,Ա�������ա�
	������getSalary(int month) 
	���ݲ����·���ȷ�����ʣ�
	�������Ա�������գ���˾����⽱��100Ԫ��

 * @author Song
 *
 */
public class Employee {
    private String name;//Ա������
    private int employeeMonth;//Ա��������
    private double salary;//Ա��н��
    
	
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
