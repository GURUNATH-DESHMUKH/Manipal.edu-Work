package caseStudy;

import java.util.Scanner;

public class AdminLogInExi {
	
	static Scanner sc=new Scanner(System.in);
	
	public boolean AdminLogInExi(AdminLogIn ali) throws InterruptedException
	{
		boolean flag =false;
		System.out.println("Enter Username for Admin Login");
		String cuu=sc.next();
		Thread.sleep(400);
		System.out.println();
		
		System.out.println("Enter Password for Admin Login");
		String cup=sc.next();
		Thread.sleep(400);
		System.out.println();
		//user sign in
		boolean check=ali.AdminLogIn(cuu, cup);
		if(check)
		{
			System.out.println("Login Successfull!");
			Thread.sleep(600);
			System.out.println();
			System.out.println(" -Welcome "+cuu+"- ");
			flag=true;
			return flag;
		}
		else
		{
			System.out.println("Invalid Username and Password.");
			return flag;
		}
	}
}
