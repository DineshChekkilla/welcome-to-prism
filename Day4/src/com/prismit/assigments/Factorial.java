/**
 * 
 */
package com.prismit.assigments;

/**
 * @author dines
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =9;
		int fact = 1;
		for(int index =1;index<=num;index++) {
			fact = fact*index;
			System.out.println("the given factorial number is ;" +fact);
		}

	}

}
