package caseStudy;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserViewBookRating {
	public void UserViewBookRating() 
	{
		JDBCConnectorClass jcc =new JDBCConnectorClass();
		
		try
		{	
			jcc.connect();
			Statement stmt=jcc.c.createStatement();
			String query = "select * from BOOK_INFO  order by USER_RATING DESC,BOOK_NAME";
			Statement smst=jcc.c.createStatement();
			ResultSet rs=smst.executeQuery(query);
			System.out.println("We appriciate your patience. Displaying all top-rated books");
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
			int sr=1;
			while(rs.next())  
			{
				if(sr<10)
					System.out.println(sr+++"."+" Book name  : "+rs.getString(1)+" \nAuther Name   : "+rs.getString(2)+" \nCategory      : "+rs.getString(3)+" \nRating        : "+rs.getString(4)+"\n");  
				else
					System.out.println(sr+++"."+" Book name : "+rs.getString(1)+" \nAuther Name   : "+rs.getString(2)+" \nCategory      : "+rs.getString(3)+" \nRating        : "+rs.getString(4)+"\n");  
			}
			jcc.c.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
