package Java_Assignment;

import java.util.Scanner;
/*
 * WAP--> Write a program

Q.WAP to swap the values of 2 nos.(Take input from user)
eg a=10 b=20

after swapping
a=20 b=10

 */
public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		Q02Method obj=new Q02Method();
		obj.Q02Method(a, b);
	}

}
