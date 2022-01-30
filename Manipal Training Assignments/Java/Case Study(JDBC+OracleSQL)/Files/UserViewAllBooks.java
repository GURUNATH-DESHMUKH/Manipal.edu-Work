package caseStudy;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserViewAllBooks {
	public void UserViewAllBooks()
	{
		JDBCConnectorClass jcc =new JDBCConnectorClass();
		try
		{
			jcc.connect(); 
			String query = "select * from BOOK_INFO order by BOOK_NAME";
			Statement smst=jcc.c.createStatement();
			ResultSet rs=smst.executeQuery(query);
			int sr=1;
			System.out.println("Please wait. Viewing all books");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(" .");
			Thread.sleep(400);
			System.out.print(" .");
			Thread.sleep(600);
			System.out.println();
			System.out.println();
			Thread.sleep(200);
			while(rs.next())  
			{
				if(sr<10)
					System.out.println(sr+++"."+" Book name  : "+rs.getString(1)+" \nAuther Name   : "+rs.getString(2)+" \nCategory      : "+rs.getString(3)+" \nRating        : "+rs.getString(4)+"\n");  
				else
					System.out.println(sr+++"."+" Book name : "+rs.getString(1)+" \nAuther Name   : "+rs.getString(2)+" \nCategory      : "+rs.getString(3)+" \nRating        : "+rs.getString(4)+"\n");  
			}			
			jcc.c.close();  
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
