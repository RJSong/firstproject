package com.geminno.Order;
/**
 * �ջ�����Ϣ
 * @author Song
 *
 */
public class User {
    private String name;//�ջ�������
    private String phone;//�ջ��˵绰
    private String address; //�ջ��˵�ַ
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
