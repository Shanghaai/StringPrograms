package StringBufferBuilderDemos;

public class StringEqualsDemo {
	
	public static void main(String [] args){ 
		 
		String Fstr= new String("J");
		String Sstr= new String("J"); 
		 
		System.out.println(Fstr.equals(Sstr));
		System.out.println(Fstr==Sstr);
		 
		System.out.println(Fstr.hashCode());
		System.out.println(Sstr.hashCode());
		}
}
