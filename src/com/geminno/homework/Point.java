package com.geminno.homework;
/**
 * ����һ����Point�࣬������ʾ��άƽ���ϵ�һ���㡣
       a���������ɾ����ض�����ĵ����
       b���ṩ�������þ�������ķ�����
       c���ṩ���Լ���õ㵽ԭ��(0,0)�ľ���ķ���
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
	 * ���þ�������ķ�����
	 */
	
	 public void setPoint(int x, int y){
		   this.x = x;
		   this.y = y;
	   
	   }
	 public String getPoint(){
		 System.out.println("����λ��======> ������:"+x+",������"+y);
		 return x+","+y;
		
		 
	 }
	/**
	 * ����õ㵽ԭ��(0,0)�ľ���
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
		System.out.println("������:"+p.getX());
		System.out.println("������:"+p.getY());
		p.getPoint();
		System.out.println("�õ㵽ԭ��ľ��룺"+p.getLength());
	    
	}
}
