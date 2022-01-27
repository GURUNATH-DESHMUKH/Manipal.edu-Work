package Java_Assignment;

import java.util.Scanner;

/*
 * WAP--> Write a program

Q.Swap the nos in Array.
 */
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert size of array");
		int n = sc.nextInt();
		System.out.println("Insert elements of array");
		int arr[] = new int[n];
		int res[] = new int[n];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i] = sc.nextInt();
		}
		Q10Method  obj=new Q10Method();
		res=obj.Q10Method(arr);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(res[i]);
		}
	}
}
