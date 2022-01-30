package caseStudy;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class AdminDeleteBook {
	
	JDBCConnectorClass jcc =new JDBCConnectorClass();
	static Scanner sc=new Scanner(System.in);
	
	public boolean AdminDeleteBook(String bn)
	{
		boolean flag =false;
		try {
			jcc.connect();
			
			String query = "DELETE FROM BOOK_INFO WHERE BOOK_NAME='"+bn+"'";
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
