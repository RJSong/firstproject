package com.geminno.homework_05;
/**
 * дһ�����򣬰����ɸ������͵�Ա������һ��Employee�����
        дһ����������ӡ��ĳ��ÿ��Ա���Ĺ������
        
        
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
        
            System.out.println("zhangsan�Ĺ���Ϊ" + a[0].getSalary(2));  
            System.out.println("lisi�Ĺ���Ϊ" + a[1].getSalary(2));  
            System.out.println("wangwu�Ĺ���Ϊ" + a[2].getSalary(2));  
            System.out.println("xiaoming�Ĺ���Ϊ" + a[3].getSalary(2));  
	}
}
