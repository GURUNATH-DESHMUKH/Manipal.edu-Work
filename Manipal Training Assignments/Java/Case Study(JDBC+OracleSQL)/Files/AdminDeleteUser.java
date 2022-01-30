package caseStudy;

import java.sql.Statement;
import java.util.Scanner;

public class AdminDeleteUser {
	
	JDBCConnectorClass jcc =new JDBCConnectorClass();
	static Scanner sc=new Scanner(System.in);
	
	public boolean AdminDeleteUser(String un)
	{
		boolean flag =false;
		try {
			jcc.connect();
			
			String query = "DELETE FROM USER_INFO WHERE USERNAME='"+un+"'";
			Statement s=jcc.c.createStatement();
			s.executeUpdate(query);
			flag=true;
			System.out.println("Deleted Successfully.");
			jcc.c.close(); 
			return flag;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return flag;
	}
}
