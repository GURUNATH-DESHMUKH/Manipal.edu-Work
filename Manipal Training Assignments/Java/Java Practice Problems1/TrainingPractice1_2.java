package training_mpl;
import java.util.Scanner;

public class TrainingPractice1_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter "+(i+1)+"th element");
			arr[i]=sc.nextInt();
		}
		
		HighestNumOfArray k=new HighestNumOfArray();
		
		System.out.println("Largest element of the array is "+k.HighestNumOfArray(arr));
		
	}

}
