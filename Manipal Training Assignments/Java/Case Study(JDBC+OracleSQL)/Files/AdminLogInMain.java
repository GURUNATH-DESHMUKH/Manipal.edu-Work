package caseStudy;

import java.util.Scanner;

public class AdminLogInMain {
	
	Scanner sc=new Scanner(System.in);
	
	public void AdminLogInMain() throws InterruptedException
	{
		boolean b=true;
		AdminAddBookNew aabn =new AdminAddBookNew();
		AdminAddBookDetails aabd =new AdminAddBookDetails();
		AdminAddBook aab =new AdminAddBook();
		AdminUpdateBookRating aubr =new AdminUpdateBookRating();
		AdminDeleteBook adb =new AdminDeleteBook();
		AdminDeleteUser adu  =new AdminDeleteUser();

		while(b)
		{
		System.out.println(" Select the operation that you want to perform");
		Thread.sleep(400);
		System.out.println();
		System.out.println("1. Add Book \n2. Update Book Rating \n3. Delete Book \n4. Delete User \n5. Log out");
		int op3=sc.nextInt();
		switch (op3) {
		case 1:
			//Adding book
			while(true) 
			{
				System.out.println();
				aabn.AdminAddBookNew(aabd, aab);
				System.out.println("Select one of the following option");
				System.out.println();
				System.out.println("1. Add another book \n2. Exit");
				int add=sc.nextInt();
				if(add!=1)
				{
					System.out.println("Exited succesfully");
					System.out.println();
					break;
				}
			}
			break;
			
		case 2:
			//update book rating
			while(true)
			{
				System.out.println();
				System.out.println("Enter book name to update the rating");
				sc.nextLine();
				String bn=sc.nextLine();
				System.out.println();
				System.out.println("Enter new user rating");
				String ur=sc.nextLine();
				boolean check=aubr.AdminUpdateBookRating(bn,ur);
				if(check)
				{
					System.out.println();
					System.out.println("Update Successful.");
					System.out.println();
					System.out.println("Select one of the following option");
					System.out.println("1. Update another book \n2. Exit");
					int add=sc.nextInt();
					if(add!=1)
					{
						System.out.println("Exited succesfully");
						break;
					}
				}
				else
					System.out.println("Invalid Entries \nPlease try again.");
			}
			break;
			
		case 3:
			//Deleting book
			sc.nextLine();
			System.out.println("Enter the name of book you want to remove.");
			String s=sc.nextLine();
			boolean check =adb.AdminDeleteBook(s);
				while(true)
				{
					System.out.println();
					System.out.println("Select one of the following option");
					System.out.println();
					System.out.println("1. Delete another book \n2. Exit");
					int guru=sc.nextInt();
					if(guru==1)
					{
						sc.nextLine();
						System.out.println("Enter the name of book you want to remove.");
						s=sc.nextLine();
						check=adb.AdminDeleteBook(s);
					}
					else
					{
						System.out.println("Exited Successfully.");
						break;
					}
				}
			
			break;
			
		case 4:
			//deleting user
			sc.nextLine();
			System.out.println("Enter the name of user you want to remove.");
			String s1=sc.nextLine();
			boolean check1 =adu.AdminDeleteUser(s1);
			while(true)
			{
				System.out.println();
				System.out.println("Select one of the following option");
				System.out.println();
				System.out.println("1. Delete another user \n2. Exit");
				int guru=sc.nextInt();
				if(guru==1)
				{
					sc.nextLine();
					System.out.println("Enter the name of user you want to remove.");
					s1=sc.nextLine();
					check1=adu.AdminDeleteUser(s1);
				}
				else
				{
					System.out.println("Exited Successfully.");
					break;
				}
			}
			
			break;
			
			
		case 5:
		{
			Thread.sleep(400);
			System.out.println();
			System.out.println("Terminating program. ");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(" .");
			Thread.sleep(400);
			System.out.print(" .");
			Thread.sleep(600);
			System.out.println();
			System.out.println("Program Terminated.");
			System.out.println();
			System.out.println("Logged out successfully!");
			System.out.println();
			b=false;
			break;
		}	
		default:
		{	
			break;}
		}
		}
	}
}