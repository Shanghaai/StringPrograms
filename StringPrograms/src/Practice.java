import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class Practice 
 {
	public static void main(String[] args) {
		Practice practice = new Practice();
		Statement stmt = null;
		boolean rs;
		int count;
		try {
			System.out.println("Enter elements to convert in char type array");
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			char[] charofstr = s1.toCharArray();

			for (char c : charofstr) {
				System.out.println(c);
			}

			System.out.println("Give me 5 String Please !");

			String[] strArray = new String[5];
			for (int i = 0; i < 5; i++) {
				strArray[i] = sc.nextLine();
			}

			for (String string : strArray) {
				System.out.println(string);
			}
			
			Connection conn=practice.getDBConnection();
			//String query = "insert into bangalore values(333,'Electronic City','Bus No 11')";
			 String query ="update bangalore set Bus='Bus No 77' where id=111";
			stmt = (Statement) conn.createStatement();

			count = stmt.executeUpdate(query);
			System.out.println("data inserted or not : " + count);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("message for exception :" + e.getMessage());
		}
	}

	/*
	 * for(int i=0;i<charofstr.length;i++) { System.out.println(charofstr[i]); }
	 */

	char[] toArray(String s1) {
		System.out.println("sahil...");
		int len = s1.length();
		char[] charofstr = new char[len];
		for (int i = 0; i < charofstr.length; i++) {
			charofstr[i] = s1.charAt(i);
		}
		return charofstr;
	}
	
	public Connection getDBConnection() throws SQLException
	{
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Laxmi", "root", "root");
		System.out.println("connection established ...");
		return conn;
		
	}
	

}
