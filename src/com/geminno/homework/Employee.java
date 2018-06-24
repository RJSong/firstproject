package com.geminno.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Employee {
	static Scanner sc=new Scanner(System.in);
     private  String empno;//编号
     private  String name;//姓名
     private  double salary;//工资
     private Employee emps;//上司
  //   private Employee[] empss;//所有下属
	 private int count=0;//统计人数

     static List<Employee> list=new ArrayList<Employee>();
	 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Employee(String empno, String name, double salary,Employee emps, Employee[] empss) {
//		super();
//		this.empno = empno;
//		this.name = name;
//		this.salary = salary;
//		this.emps = emps;
//		this.empss = empss;
//	}
	public Employee(String empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		
	}
	public Employee(String empno, String name, double salary, Employee emps) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.emps = emps;
	}
	
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
  public Employee getEmps() {
		return emps;
	}
	public void setEmps(Employee emps) {
		this.emps = emps;
	}
	
//	public Employee[] getEmpss() {
//		return empss;
//	}
//	public void setEmpss(Employee[] empss) {
//		this.empss = empss;
//	}
	//   添加下属的方法
     public void addEmp(){	   
    	    Scanner sc=new Scanner(System.in);
    	    while(true){
    	    	System.out.println("你要添加下属吗？yes/no");
    	    	String str=sc.nextLine();
    	    	if(str.equals("yes")){
		    	    System.out.println("请输入下属编号：");
		    	    String empno=sc.nextLine();
		    	    System.out.println("请输入下属姓名：");
		    	    String ename=sc.nextLine();
		    	    System.out.println("请输入下属工资：");    	    	
	    	         double salary=sc.nextDouble();
	    	        Employee e=new Employee(empno,ename,salary,null);
	    	        e.setEmps(this);
	    	        list.add(e);
	    	        count++;
    	    	}else{
    	    		System.exit(0);
    	    	}
    	    	System.out.println("目前下属有："+count+"人");
    	    }
    	  
    	 }
    
  
	

}
