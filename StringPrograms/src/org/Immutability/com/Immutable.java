package org.Immutability.com;

public class Immutable 
{
	//immutable means onces created then contents of the object can not be modified
	//chechking mutable or immutable
	
	public static void main(String[] args) 
	{
	    String s1 = new String("sahil");     // version 1 to create Stirng object
    	String s2 = "siddiqui";            // version 2
 	    s1 = s1+s2;					//using == operator..hence changes Immutable object
	    System.out.println("object of non-constant + constant pool area:"+s1);
	    
	    System.err.println("=======================================");
	    
	   //here jvm does not create a new object it will refer 
	   //s1 to sahilsiddiqui instead of s1 = sahil
	   // this is bcz String class is immutable n their contents can not be modified between various 
	   //applications so jdk dev make string as IMMUTABLE
	   //s1 which is pointing to sahil will be garbage collected = Immutable
	   //and with those new changes a new object wl be created 
   
	    String x = new String("sahil");
	    x.concat("-------abc");		//using method ..and still it is not allowing to change immutable objetc
	    System.out.println(x);
	    
	    System.err.println("===============================");
	    
	StringBuffer s = new StringBuffer("sahil");
				s.append("--shanghaai");  //mutable object(s) of String buffer
				System.out.println(s);
	}
}
