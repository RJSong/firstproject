package com.geminno.homework;

public class Rect extends Shape{
	int a,b;
	public Rect() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rect(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public double Perimeter() {
		double l=2*a+2*b;
		System.out.println("长方形的周长为："+l);
		return l;
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		double area=a*b;
		System.out.println("长方形的面积为："+area);
	    return area;
	}
}
