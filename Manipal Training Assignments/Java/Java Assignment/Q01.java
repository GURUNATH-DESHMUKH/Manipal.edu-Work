package Java_Assignment;

import java.util.Scanner;
/*
 * WAP--> Write a program

Q.WAP to find weather the no entered by user is even or odd.
 */
public class Q01 {
	public static void main(String[]a)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Q01Method obj=new Q01Method();
		obj.Q01Method(num);		
	}
}
