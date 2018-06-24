package com.geminno.homework;

public class Circle extends Shape{
    static final double PI=3.14;
     int r;
     
     
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	public double Perimeter() {
		double l= (2*PI*r);
		System.out.println("圆形的周长为："+l);
		return l;
	}
	@Override
	public double Area() {
		double area=PI*r*r;
		System.out.println("圆形的面积为："+area);
		return area;
	}
}
