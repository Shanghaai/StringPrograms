package StringBufferBuilderDemos;

public class StringBuilderEqualsDemo {
	
	public static void main(String [] args){ 
		 
		StringBuilder fstr= new StringBuilder("A");
		StringBuilder sstr= new StringBuilder("A"); 
		 
		System.out.println(fstr.equals(sstr));
		System.out.println(fstr==sstr);
		 
		System.out.println(fstr.hashCode());
		System.out.println(sstr.hashCode());
	}
}
//Same as StringBuffer String Builder also did not override equals() and hasCode() but String does7
//o/p will be like this is  beacause StringBuffer did not over ride 
//	equals and hashCode method thats why JVM at run time 
//won't be able to use these method fuctionality 