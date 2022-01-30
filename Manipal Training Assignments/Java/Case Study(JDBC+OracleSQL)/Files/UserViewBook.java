package caseStudy;

import java.util.Scanner;

public class UserViewBook {
	
	Scanner sc=new Scanner(System.in);
	UserViewAllBooks uvab =new UserViewAllBooks();
	UserViewBookRating uvbr =new UserViewBookRating();
	UserViewBookCategory uvbc =new UserViewBookCategory();
	
	public void UserViewBook() throws InterruptedException
	{
		while(true)
		{
			System.out.println("Select one of the following options.");
			Thread.sleep(400);
			System.out.println();
			System.out.println("1. View all books \n2. View top rated books \n3. View Book by category \n4. Exit");
			int guru=sc.nextInt();
			System.out.println();
			if(guru==1)
			{
				//view all books
				uvab.UserViewAllBooks();
			}
			else if(guru==2)
			{
				//view books by ratings
				uvbr.UserViewBookRating();
			}
			else if(guru==3)
			{
				uvbc.UserViewBookCategory();
			}
			else if(guru==4)
			{
				sc.nextLine();
				System.out.println("Terminating Program");
				Thread.sleep(400);
				System.out.print(".");
				Thread.sleep(400);
				System.out.print(" .");
				Thread.sleep(400);
				System.out.print(" .");
				Thread.sleep(600);
				System.out.println();
				System.out.println("Program Terminated.");
				break;
			}
			else
			{
				System.out.println("Invalid Entry");
			}
		}
	}
}
