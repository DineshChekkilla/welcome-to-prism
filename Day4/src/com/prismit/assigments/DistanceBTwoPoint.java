package com.prismit.assigments;
//**program for find the distance between two point **//
public class DistanceBTwoPoint {
	public static void main(String[] args) {
		int num1=4;
		int num2=6;
		int num3=8;
		int num4=10;
		double distance;
		distance= Math.sqrt(num2-num1)*(num2-num1)+(num4-num3)*(num4-num3);
		System.out.println("Distance between two points is:" +distance);
	}

}
