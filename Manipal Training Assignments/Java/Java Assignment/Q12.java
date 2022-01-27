package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q.WAP to check weather the no entered by user is prime or not.
 */
public class Q12 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert number");
		int n=sc.nextInt();
		Q12Method obj=new Q12Method();
		obj.Q12Method(n);
	}

}
