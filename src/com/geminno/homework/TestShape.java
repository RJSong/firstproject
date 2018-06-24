package com.geminno.homework;
/**
 * ≤‚ ‘¿‡
 * @author Song
 *
 */
public class TestShape {
    public static void main(String[] args) {
    	  Shape[] shape = new Shape[3];
    	  shape[0] = new Rect(3,4);
    	  shape[1] = new Circle(4);
    	  shape[2] = new Square(6);
    	  for (int i = 0; i < shape.length; i++) {
    	   shape[i].Perimeter();
    	   shape[i].Area();
    	  }
	}
}
