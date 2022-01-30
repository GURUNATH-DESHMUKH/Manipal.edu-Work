package caseStudy;

import java.sql.*;

public class UserSignUp {
	public boolean addUser(UserSignUpDetails d) {
		JDBCConnectorClass jcc =new JDBCConnectorClass();
		boolean flag=false;
		try
		{  
			jcc.connect();
			
			//step3 create the statement object  
			String query = "INSERT INTO USER_INFO  VALUES(?,?,?,?)";
			PreparedStatement pst=jcc.c.prepareStatement(query); 
			pst.setString(1, d.getUname());
			pst.setString(2, d.getPhnum());
			pst.setString(3, d.getPwd());
			pst.setString(4, d.getEmail());
			pst.executeUpdate();
			flag=true;
			jcc.c.close();  
			}
		catch (SQLIntegrityConstraintViolationException e) {
			// TODO: handle exception
			System.out.println("Username already taken.");
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
		return flag;
	}
}
