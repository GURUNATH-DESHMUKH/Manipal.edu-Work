package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q.Given a number N, print sum of all even numbers from 1 to N.
 */
public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Q07Method obj=new Q07Method();
		obj.Q07Method(num);
	}

}
