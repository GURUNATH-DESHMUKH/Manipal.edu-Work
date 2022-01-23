package case_study;

import java.util.Scanner;

public class Main1 {
	
	static Donar d=new Donar();
	
	public static void displayDonationDetails() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=sc.nextLine();
		d.setName(name);
		
		System.out.println("Enter Date of Birth : ");
		String dateOfBirth=sc.nextLine();
		d.setDateOfBirth(dateOfBirth);
		
		System.out.println("Enter Gender : ");
		String gender=sc.nextLine();
		d.setGender(gender);
		
		System.out.println("Enter Mobile Number : ");
		String mobileNumber=sc.nextLine();
		d.setMobileNumber(mobileNumber);
		
		System.out.println("Enter Blood Group : ");
		String bloodGroup=sc.nextLine();
		d.setBloodGroup(bloodGroup);
		
		System.out.println("Enter Blood Bank Name : ");
		String bloodBankName=sc.nextLine();
		d.setBloodBankName(bloodBankName);
		
		System.out.println("Enter Donar Type : ");
		String donarType=sc.nextLine();
		d.setDonarType(donarType);
		
		System.out.println("Enter Donation Date : ");
		String DonationDate=sc.nextLine();
		d.setDonationDate(DonationDate);
		
		System.out.println("Donation Details : ");
		System.out.println("Name : " + d.getName());
		System.out.println("Date of Birth : " + d.getDateOfBirth());
		System.out.println("Gender : " + d.getGender());
		System.out.println("Mobile Number : " + d.getMobileNumber());
		System.out.println("Blood Group : " + d.getBloodGroup());
		System.out.println("Blood Bank Name : " + d.getBloodBankName());
		System.out.println("Donor Type : " + d.getDonarType());
		System.out.println("Donation Date : " + d.getDonationDate());
	}
	
	public static void main(String[]a)
	{
		displayDonationDetails();
	}
}
