package com.geminno.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Employee {
	static Scanner sc=new Scanner(System.in);
     private  String empno;//���
     private  String name;//����
     private  double salary;//����
     private Employee emps;//��˾
  //   private Employee[] empss;//��������
	 private int count=0;//ͳ������

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
	//   ��������ķ���
     public void addEmp(){	   
    	    Scanner sc=new Scanner(System.in);
    	    while(true){
    	    	System.out.println("��Ҫ���������yes/no");
    	    	String str=sc.nextLine();
    	    	if(str.equals("yes")){
		    	    System.out.println("������������ţ�");
		    	    String empno=sc.nextLine();
		    	    System.out.println("����������������");
		    	    String ename=sc.nextLine();
		    	    System.out.println("�������������ʣ�");    	    	
	    	         double salary=sc.nextDouble();
	    	        Employee e=new Employee(empno,ename,salary,null);
	    	        e.setEmps(this);
	    	        list.add(e);
	    	        count++;
    	    	}else{
    	    		System.exit(0);
    	    	}
    	    	System.out.println("Ŀǰ�����У�"+count+"��");
    	    }
    	  
    	 }
    
  
	

}
