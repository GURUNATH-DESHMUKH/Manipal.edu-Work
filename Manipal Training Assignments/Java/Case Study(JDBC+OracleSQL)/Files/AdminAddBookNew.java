package caseStudy;

import java.util.Scanner;

public class AdminAddBookNew {
	
	static Scanner sc=new Scanner(System.in);
	
	public void AdminAddBookNew(AdminAddBookDetails aabd, AdminAddBook aab)
	{
		System.out.println("Enter Book Name.");
		String bname=sc.nextLine();
		System.out.println();
		
		System.out.println("Enter Book Auther Name");
		String baname=sc.nextLine();
		System.out.println();
		
		System.out.println("Enter Book Catagory");
		String ctg=sc.nextLine();
		System.out.println();
		
		System.out.println("Enter User Rating");
		String ur=sc.nextLine();
		System.out.println();
		
		aabd.setBname(bname);
		aabd.setBaname(baname);
		aabd.setCtg(ctg);
		aabd.setUr(ur);
		boolean check=aab.addBook(aabd);
		if (check)
		{
			System.out.println("Book Inserted Successfully!");
		}
		else
		{
			System.out.println("Enter valid entry, check for redundancy.");
		}
	}
}
