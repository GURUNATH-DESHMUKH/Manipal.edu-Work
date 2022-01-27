package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q.WAP to calculate and display the factorial of a no entered by user.
 */
public class Q11 {
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert number");
		int num=sc.nextInt();
		Q11Method obj=new Q11Method();
		obj.Q11Method(num);
	}
}
