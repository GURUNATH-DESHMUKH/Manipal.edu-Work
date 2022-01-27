package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q14.WAP to generate the reverse of a given number N. Print the corresponding reverse number.
 */
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println("Reversed number");
		Q14Method obj=new Q14Method();
		obj.Q14Method(n);
	}
}