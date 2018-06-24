package com.geminno.Order;
/**
 * 收货人信息
 * @author Song
 *
 */
public class User {
    private String name;//收货人姓名
    private String phone;//收货人电话
    private String address; //收货人地址
    private int age;
    
    public User(){
    	
    }
	 public User(String name){
		    this();
		    
	    	this.name=name;
	 }
	 public User(int age){
		 this();
		 this.age=age;
	 }
}
