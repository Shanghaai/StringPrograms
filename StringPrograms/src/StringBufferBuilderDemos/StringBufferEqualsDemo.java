package StringBufferBuilderDemos;

public class StringBufferEqualsDemo {

	public static void main(String [] args){ 
		 
		StringBuffer fstr= new StringBuffer("B");
		StringBuffer sstr= new StringBuffer("B"); 
		 
		System.out.println(fstr.equals(sstr)); //false
		System.out.println(fstr==sstr);  //false
		 
		System.out.println(fstr.hashCode()); //42424242131
		System.out.println(sstr.hashCode());// 6741241414141
	}
}
//	o/p will be like this is  beacause StringBuffer did not over ride 
// 	equals and hashCode method thats why JVM at run time 
//	won't be able to use these method fuctionality 