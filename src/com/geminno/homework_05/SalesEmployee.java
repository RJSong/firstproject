package com.geminno.homework_05;
/**
 * Employee�����࣬������Ա��
 * �����������۶������ʾ�����
        ���ԣ������۶�����
        
 * @author Song
 *
 */
public class SalesEmployee extends Employee {
    private static double salary;
	private double monthSale;//�����۶�
    private double saleRate;//�����
     
	

	
	public SalesEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(String name, int employeeMonth,double monthSale, double saleRate) {
		super(name, employeeMonth, salary);
		this.monthSale = monthSale;
		this.saleRate = saleRate;
	}




	public double getSalary(int month){
	    salary=monthSale*saleRate+super.getSalary(month);
		return salary;
	}
    
}
