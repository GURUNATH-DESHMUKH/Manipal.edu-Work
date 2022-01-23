package training_mpl;
import java.util.Scanner;

public class TrainingPractice1_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first and last name.");
		String first_name=sc.next();
		String second_name=sc.nextLine();
		
		NamePrinter a=new NamePrinter();
		a.setFirst_name(first_name);
		a.setSecond_name(second_name);
		System.out.println("Full name is "+a.getFirst_name()+" "+a.getSecond_name());
		
	}

}
