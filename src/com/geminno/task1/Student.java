package com.geminno.task1;

public class Student extends Person {
    
   

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
			 Student st =new Student();
			 st.setId("1234");
			 
			 st.getSex();
			 System.out.println(st.getId());
	}
	
}
