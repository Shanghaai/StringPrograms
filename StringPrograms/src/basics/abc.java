package basics;
import java.util.Scanner;
//public class abc 
//{ 
//	String s1 = "SAHIL";
  //  String s2 = "SAH";
public class abc 
{
	String s1="sahil";
	String s2="sah";
	String s3=s2+"il";
    public static void main(String[] args) 
    {
    	System.out.println("Type the String to convert it into array");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();  //This method always returns the line that was skipped
        //This method returns the rest of the current line, excluding any line separator at the end. 
		
		for(int i=0;i<s1.length();i++)
		{
		    System.out.print(s1);
		}
	}
}
