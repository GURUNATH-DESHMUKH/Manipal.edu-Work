package caseStudy;

import java.sql.Statement;

public class AdminUpdateBookRating {
	
	public boolean AdminUpdateBookRating(String bn,String ur)
	{
		JDBCConnectorClass jcc =new JDBCConnectorClass();
		boolean flag=false;
		try
		{  
			jcc.connect();
			Statement stmt=jcc.c.createStatement();
			
			//step3 create the statement object  
			String query = "update BOOK_INFO set USER_RATING='"+ur+"' where BOOK_NAME='"+bn+"'";
			stmt.execute(query);
			flag=true;
			return flag;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return flag;
	}
}
