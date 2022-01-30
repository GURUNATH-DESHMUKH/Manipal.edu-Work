package caseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectorClass {
	
	Connection c;
	
	public void connect() throws ClassNotFoundException, SQLException
	{
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
			
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","PROJ","proj"); 
		
		c=con;
	}
}
