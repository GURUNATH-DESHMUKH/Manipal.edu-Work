package caseStudy;

import java.util.Scanner;

public class UserSignUpReg {
	
	static Scanner sc=new Scanner(System.in);
	

	public void UserSignUpReg(UserSignUpDetails usud, UserSignUp usu) throws InterruptedException
	{
		UserSignInExi usie =new UserSignInExi();
		UserSignIn usi =new UserSignIn();
		UserSignUpReg usur =new UserSignUpReg();
		
		boolean check;
		System.out.println();
		System.out.println("Enter Username");
		String nuu=sc.next();
		System.out.println();
		
		System.out.println("Enter Phone Number");
		String nupn=sc.next();
		System.out.println();
		
		System.out.println("Enter Password");
		String nup=sc.next();
		System.out.println();
		
		System.out.println("Enter Email ID");
		String nue=sc.next();
		
		usud.setUname(nuu);
		usud.setPhnum(nupn);
		usud.setPwd(nup);
		usud.setEmail(nue);
		
		check=usu.addUser(usud);
		Thread.sleep(500);
		if(check)
		{
			System.out.println();
			System.out.println("Wait for a while...");
			System.out.println("User created successfully \nSign up using this username and password.");
			Thread.sleep(400);
			System.out.println("Redirecting to Sign In");
			Thread.sleep(400);
			System.out.print(".");
			Thread.sleep(400);
			System.out.print(" .");
			Thread.sleep(400);
			System.out.print(" .");
			Thread.sleep(600);
			System.out.println();
			System.out.println();
			usie.UserSignInExi(usi);
		}
		else
		{
			sc.nextLine();
			System.out.println("Enter different username.");
			usur.UserSignUpReg(usud, usu);
		}
		
		//user  login
	}
}
