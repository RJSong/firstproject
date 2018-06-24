package com.geminno.homework_05;
/**
 * 写一个程序，把若干各种类型的员工放在一个Employee数组里，
        写一个函数，打印出某月每个员工的工资数额。
        
        
 * @author Song
 *
 */
public class TestEmployee {
	  
        public static void main(String[] args) {
        	Employee a[] = new Employee[10];  
            
            a[0] = new SalariedEmployee("zhangsan",2,3000);  
            a[1] = new HourlyEmployee("lisi",2,50,200);  
            a[2] = new SalesEmployee("wangwu",3,50000,0.1);  
            a[3] = new BasedPlusSalesEmployee("xiaoming",5,50000,0.1,4000);  
        
            System.out.println("zhangsan的工资为" + a[0].getSalary(2));  
            System.out.println("lisi的工资为" + a[1].getSalary(2));  
            System.out.println("wangwu的工资为" + a[2].getSalary(2));  
            System.out.println("xiaoming的工资为" + a[3].getSalary(2));  
	}
}
