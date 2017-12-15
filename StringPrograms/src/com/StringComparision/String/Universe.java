package com.StringComparision.String;

public class Universe 
{
	public static void main(String[] args) 
	{
	   	 String s = "Earth";
		 String s1 =  new String("Earth");
		 
	     if(s1==s)
	     {
	    	 System.out.println("both are same objects");
	     }
	     else
	     {
	    	 System.out.println("they are not same objets means = = operator uses object refernce number");
	    	 System.out.println("And their refernce number are : "+s+"---"+s1);
	     }
	     
	   if(s.equals(s1));
	    System.out.println("they are same! if we use equals() method means equals method uses Objects Contents i.e. Earth");
	    
	    //if two object are equal via equal() then their compareTo must return 0
	    System.out.println("comapring both object by compareTo : "+s.compareTo(s1));
	     
	     
	     int x  = s.hashCode();
	     int x1 = s1.hashCode();
	     System.out.println("lets check their Hashcode :"+x+" "+x1+" "+"Ooh means hashcode are same");
	 }
}
