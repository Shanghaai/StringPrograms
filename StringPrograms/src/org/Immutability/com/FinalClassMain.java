package org.Immutability.com;

public class FinalClassMain 
{
	
public static void main(String[] args) {
	FinalClass fc = new FinalClass();
	fc.setI(5);
	fc.setName("Shanghaai");
	
	System.out.println(fc.getI());
	System.out.println(fc.getName());
	
}
}
