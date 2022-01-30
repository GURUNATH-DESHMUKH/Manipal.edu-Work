package caseStudy;

import java.util.Scanner;

public class Display {

	static Scanner sc=new Scanner(System.in);
	
	public void Display() throws InterruptedException
	{
		UserSignUpDetails usud =new UserSignUpDetails();
		UserSignUp usu =new UserSignUp();
		UserSignUpReg usur =new UserSignUpReg();
		UserSignIn usi =new UserSignIn();
		UserSignInExi usie =new UserSignInExi();
		AdminLogIn ali =new AdminLogIn();
		AdminLogInExi alie =new AdminLogInExi();
		
		AdminLogInMain alim = new AdminLogInMain();
		
		System.out.println(" | ^_^ | ^_^ | ^_^ |  Welcome to LMS  | ^_^ | ^_^ | ^_^ | ");
		System.out.println("----------------------------------------------------------");
		Thread.sleep(600);
		System.out.println("Select the appropiate option to login.");
		Thread.sleep(400);
		System.out.println();
		System.out.println("1. Admin Login \n2. User Login");
		System.out.println();
		
		int op1=sc.nextInt();
		
		//Admin Login
		if(op1==1)
		{
			boolean rv =alie.AdminLogInExi(ali);
			
				alim.AdminLogInMain();
			
		}
		
		//User Login/Signup
		else if(op1==2)
		{
			//user  login
			System.out.println("1. Sign In with existing username and password");
			System.out.println("2. Sign Up for creating new profile");
			int op2=sc.nextInt();
			System.out.println();
			if(op2==1)
			{
				usie.UserSignInExi(usi);
				
			}
			//user signup
			else if(op2==2)
			{
				//user creation.
				usur.UserSignUpReg(usud, usu);
				Thread.sleep(400);
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
				Thread.sleep(400);
				System.out.println("Run the program again to login");
				usie.UserSignInExi(usi);
			}
			else 
				System.out.println("Invalid input");
		}
		else 
			System.out.println("Invalid input");
	}
}
