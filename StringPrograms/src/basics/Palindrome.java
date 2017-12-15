package basics;

import java.io.*;
import java.util.Scanner;

public class Palindrome
{
	//accept the String from keyboared
	public static void main(String[] args) throws IOException 
	{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  //or except for this line you can also use 
	  //Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the name :");
	  String str = br.readLine();
	  String temp=str;
	  //convert the string into StringBuffer
	  StringBuffer sb = new StringBuffer(str);
	  sb.reverse();
	  str =sb.toString();
	  System.out.println(str);
	  
	  if(temp.equalsIgnoreCase(str))
	  {
		  System.out.println(temp+ "  is palindrome");
	  }
	  else 
		  {
		  System.out.println(temp+ " not a palindrome :");
		  }
	}	  
}