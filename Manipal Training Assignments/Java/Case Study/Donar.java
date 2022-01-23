package case_study;

public class Donar extends Person
{
	private String bloodBankName;
	private String donarType;
	private String DonationDate;
	
	public String getBloodBankName() {
		return bloodBankName;
	}
	
	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}
	
	public String getDonarType() {
		return donarType;
	}
	
	public void setDonarType(String donarType) {
		this.donarType = donarType;
	}
	
	public String getDonationDate() {
		return DonationDate;
	}
	
	public void setDonationDate(String donationDate) {
		DonationDate = donationDate;
	}
	
}
