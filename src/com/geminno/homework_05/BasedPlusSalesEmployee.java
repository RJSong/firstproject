package com.geminno.homework_05;
/**
 * SalesEmployee�����࣬�й̶���н��������Ա��
        �����ɵ�н����������ɲ��֡����ԣ���н��
        
        
 * @author Song
 *
 */
public class BasedPlusSalesEmployee extends SalesEmployee{
	 private double lowSalary;//��н
	
	public BasedPlusSalesEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasedPlusSalesEmployee(String name, int employeeMonth, 
		double monthSale, double saleRate,double lowSalary) {
		super( name,  employeeMonth,  monthSale,  saleRate);
		this.lowSalary = lowSalary;
	}


	public double getSalary(int month){
		return lowSalary+super.getSalary(month);
		
     }
}
