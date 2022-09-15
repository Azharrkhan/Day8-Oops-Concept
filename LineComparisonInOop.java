package com.bl.linecomparison.oop;

import java.util.Scanner;

class Coordinate{
	Scanner sc = new Scanner(System.in);
	//static variables
	static double x1, y1, x2, y2, x3, y3, x4, y4;
	static double distance1, distance2;
	
	//endPoint1
	public void point1(){
		System.out.println("Enter x1, y1");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
	}
	//endPoint2
	public void point2(){
		System.out.println("Enter x2, y2");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
	}
	//distance between point 1 and point 2
	public void distance1(){
		distance1 = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.println("Distance1 is: " +distance1);
	}
	//endPoint3
	public void point3(){
		System.out.println("Enter x3, y3");
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
	}
	//endPoint4
	public void point4(){
		System.out.println("Enter x4, y4");
		x4 = sc.nextDouble();
		y4 = sc.nextDouble();
	}
	//distance between point 1 and point 2
		public void distance2(){
			distance2 = Math.sqrt(Math.pow((x4-x3), 2)+Math.pow((y4-y3), 2));
			System.out.println("Distance2 is: " +distance2);
		}
	//Check line's equality
	public void checkLineEquality() {
		String str1 = Double.toString(distance1);
		String str2 = Double.toString(distance2);
		
		if(str1.equals(str2) == true) {
			System.out.println("Both lines are equal");
		}else {
			System.out.println("Both lines are not equal");
		}
	}
}
public class LineComparisonInOop {
	public static void main(String[] args) {
		
	System.out.println("Welcome to Line Comparison Computation Program");
		Coordinate cr = new Coordinate();
		cr.point1();
		cr.point2();
		cr.distance1();
		cr.point3();
		cr.point4();
		cr.distance2();
		cr.checkLineEquality();
	}
}
