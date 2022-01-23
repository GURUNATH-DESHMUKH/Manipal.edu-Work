package training_mpl;
import java.util.Scanner;

public class TrainingPractice1_3 {

	public static void sequence(int arr[]) {
		  int i=0;
		  int j=1;
		  int res[] = new int[arr.length];
		  int k=0;
		  while(j<res.length) {
			  res[k] = arr[j];
			  k++;
			  res[k] = arr[i];
			  k++;
			  i = j+1;
			  j = i+1;
			  
		  }
		  while(i<res.length) {
			  res[i] = arr[i];
			  i++;
		  }
		  for(int k1=0;k1<res.length;k1++) {
			  System.out.print(res[k1]+" ");
		  }
	  }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
    sequence(arr);

	}
}