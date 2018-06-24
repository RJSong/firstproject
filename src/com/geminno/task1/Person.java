package com.geminno.task1;

public class Person {
     private String name;
     public int age;
     
     protected String id;
     String sex;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	
	 void getSex() {
		System.out.println("nan");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return "уехЩ";
	}
	public void setName(String name) {
		this.name = name;
	}
     
     protected void setId(String id){
    	 this.id=id;
     }
     protected String getId(){
    	 return id;
     }
	
}
