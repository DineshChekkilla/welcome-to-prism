package com.prismit.assigments;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 8;
		for(int i =1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
	}

}
