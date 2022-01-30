package caseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserSignIn {
	public boolean UserSignIn (String un,String ps)
	{
		boolean flag=false;
		JDBCConnectorClass jcc =new JDBCConnectorClass();
		
		try
		{
			
			jcc.connect();
			 
			//step3 create the statement object  
			Statement stmt=jcc.c.createStatement();  
			  
			//step4 execute query  
			String query="select PASSWORD from USER_INFO where USERNAME='"+un+"'";
			ResultSet rs=stmt.executeQuery(query);
			rs.next();
			String pass=rs.getString(1);
			
			if(pass.equals(ps))
			{
				return true;
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return flag;
	}
}