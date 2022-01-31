package caseStudy;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserViewBookCategory {
	public void UserViewBookCategory()
	{
		JDBCConnectorClass jcc =new JDBCConnectorClass();
		try
		{
			jcc.connect(); 
			Statement smst1=jcc.c.createStatement();
			System.out.println("Here below are all the categories.");
			System.out.println();
			Thread.sleep(600);
			String query1 = "select distinct(CATEGORY) from BOOK_INFO order by CATEGORY";
			ResultSet rs1=smst1.executeQuery(query1);
			int srn=1;
			while(rs1.next())  
			{
				System.out.println(srn+++" "+rs1.getString(1));
			}
			
			Statement smst=jcc.c.createStatement();
			Thread.sleep(600);
			System.out.println();
			System.out.println("Enter Catagory name that you want to browse");
			Scanner s=new Scanner(System.in);
			String ctg=s.nextLine();
			String query = "select * from BOOK_INFO where CATEGORY ='"+ctg+"'order by BOOK_NAME";
			ResultSet rs=smst.executeQuery(query);
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
		catch (Exception e)
		{
			System.out.println("Invalid category.");
			System.out.println(e.getMessage());
		}
	}
}
