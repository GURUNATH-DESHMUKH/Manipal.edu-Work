package caseStudy;

import java.util.Scanner;

public class UserSignInExi {
	
	static Scanner sc=new Scanner(System.in);
	UserViewBook uvb=new UserViewBook();
	
	public void UserSignInExi(UserSignIn usi) throws InterruptedException
	{
		System.out.println("Enter Username for User Login");
		String cuu=sc.next();
		Thread.sleep(400);
		System.out.println();
		
		System.out.println("Enter Password for User Login");
		String cup=sc.next();
		Thread.sleep(400);
		System.out.println();
		
		//user sign in
		boolean check=usi.UserSignIn(cuu, cup);
		if(check)
		{
			System.out.println("Login Successfull!");
			//user menu
			Thread.sleep(600);
			System.out.println();
			System.out.println(" -Welcome "+cuu+"- ");
			Thread.sleep(600);
			uvb.UserViewBook();
		}
		else
		{
			System.out.println("Invalid Username and Password.");
		}
	}

}
