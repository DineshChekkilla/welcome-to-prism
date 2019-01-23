package com.prismit.assigments;
//** program for reverse a string **//
public class StringReverseExample {
	public static void main(String[] args) {
	      String string = "welcome to prismi IT crop";
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);
	   }
}
