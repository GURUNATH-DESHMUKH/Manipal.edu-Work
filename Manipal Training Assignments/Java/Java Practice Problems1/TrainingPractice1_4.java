package training_mpl;
import java.util.Scanner;

public class TrainingPractice1_4 {
	public static boolean isprime(int n) {
		int count=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     
     boolean check = isprime(n);
     if(check==true) {
    	 System.out.println(n+" is prime ");
     }
     else {
    	 System.out.println(n+" is not a prime");
     }
     
	}

}

