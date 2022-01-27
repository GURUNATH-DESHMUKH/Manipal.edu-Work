package Java_Assignment;
/*
 * WAP--> Write a program

Q.WAP to find the greatest between the 3 nos and display the output. (Take input from user)

 */
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd number");
		int num3=sc.nextInt();
		Q03Method obj=new Q03Method();
		obj.Q03Method(num1, num2, num3);
	}

}
