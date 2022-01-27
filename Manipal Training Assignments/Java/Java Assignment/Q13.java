package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q.Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
 */
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number");
		int num=sc.nextInt();
		Q13Method obj=new Q13Method();
		obj.Q13Method(num);
	}

}
