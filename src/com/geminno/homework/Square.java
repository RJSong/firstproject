package com.geminno.homework;

public class Square extends Rect{
    int a;
    
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Square(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	public Square(int a) {
		super();
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double Perimeter(){
		double l=a+a+a+a;
		System.out.println("�����ε��ܳ�Ϊ��"+l);
		return l;
	}
	public double Area(){
		double area=a*a;
		System.out.println("�����ε����Ϊ��"+area);
		return area;
	}
}
