package Java_Assignment;
/*
 * WAP--> Write a program

Q.Revers an Array.

 */
import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] res=new int[size];
		Q09Method obj=new Q09Method();
		res=obj.Q09Method(arr);
		System.out.println("Reversed array is as follow");
		for (int i=0;i<size;i++)
		{
			System.out.println(res[i]);
		}
		
	}

}
