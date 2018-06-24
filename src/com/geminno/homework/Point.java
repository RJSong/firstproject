package com.geminno.homework;
/**
 * 定义一个点Point类，用来表示二维平面上的一个点。
       a、可以生成具有特定坐标的点对象
       b、提供可以设置具体坐标的方法。
       c、提供可以计算该点到原点(0,0)的距离的方法
 * @author Song
 *
 */
public class Point {
   private int x;
   private int y;
	
   public Point(int x, int y) {
	   super();
	   this.x=x;
	   this.y=y;
       
    }
     public Point(){
	   super();
     }
  
	public int getX() {
	   return x;
    }
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
		
	}
	
	/**
	 * 设置具体坐标的方法。
	 */
	
	 public void setPoint(int x, int y){
		   this.x = x;
		   this.y = y;
	   
	   }
	 public String getPoint(){
		 System.out.println("坐标位置======> 横坐标:"+x+",纵坐标"+y);
		 return x+","+y;
		
		 
	 }
	/**
	 * 计算该点到原点(0,0)的距离
	 * @param a
	 * @param b
	 */
	public double getLength(){
		double l=Math.sqrt(Math.pow((x-0), 2)+Math.pow((y-0), 2));
		return l;

	}
	
	public static void main(String[] args) {
		Point p=new Point(3,4);
		p.setX(3);
		p.setY(4);
		System.out.println("横坐标:"+p.getX());
		System.out.println("纵坐标:"+p.getY());
		p.getPoint();
		System.out.println("该点到原点的距离："+p.getLength());
	    
	}
}
