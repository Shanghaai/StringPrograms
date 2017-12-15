package StringBufferBuilderDemos;

public class StringAndStringBuffer 
{
	public static void main(String[] args) 
	{
		String s =  new String("sahil");
		StringBuffer sb  =new StringBuffer("sahil");
		
		System.out.println(s.equals(sb));
		System.out.println(s.hashCode());
		System.out.println(sb.hashCode());
	}
}
