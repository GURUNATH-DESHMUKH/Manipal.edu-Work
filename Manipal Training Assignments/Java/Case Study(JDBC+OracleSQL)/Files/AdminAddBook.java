package caseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminAddBook {
	public boolean addBook(AdminAddBookDetails d) {
		boolean flag=false;
		JDBCConnectorClass jcc =new JDBCConnectorClass();
		try
		{
			jcc.connect();
			String query = "INSERT INTO BOOK_INFO  VALUES(?,?,?,?)";
			PreparedStatement pst=jcc.c.prepareStatement(query); 
			pst.setString(1, d.getBname());
			pst.setString(2, d.getBaname());
			pst.setString(3, d.getCtg());
			pst.setString(4, d.getUr());
			pst.executeUpdate();
			flag=true;
			jcc.c.close();  
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return flag;
	}
}
