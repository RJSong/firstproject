package com.geminno.homework_05;
/**
 * Employee的子类，销售人员，
 * 工资由月销售额和提成率决定。
        属性：月销售额、提成率
        
 * @author Song
 *
 */
public class SalesEmployee extends Employee {
    private static double salary;
	private double monthSale;//月销售额
    private double saleRate;//提成率
     
	

	
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
