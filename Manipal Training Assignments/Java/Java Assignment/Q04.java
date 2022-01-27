package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q.WAP to find weather the character entered by user is a vowel or not.(solve by using if..else and switch case)

 */
public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter charecter ");
		char ch=sc.next().charAt(0);
		Q04Method obj=new Q04Method();
		obj.Q04Method(ch);
	}
}
