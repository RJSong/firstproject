package com.geminno.homework_05;
/**
 * SalesEmployee的子类，有固定底薪的销售人员，
        工资由底薪加上销售提成部分。属性：底薪。
        
        
 * @author Song
 *
 */
public class BasedPlusSalesEmployee extends SalesEmployee{
	 private double lowSalary;//底薪
	
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
