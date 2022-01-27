package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q. WAP to print the following patterns  
a.for n=4
1
22
333
4444

b.for n=4
4444
4444
4444
4444

c.for n=5
    *
   **
  ***
 ****
*****

 */
public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for pattern.");
		int n=sc.nextInt();
		Q08Method obj=new Q08Method();
		obj.Q08Method(n);
	}

}
