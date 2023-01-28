
public class Customer {
	
	private String Name;
	private int AccountNumber;
	private double Balance;
	private String Dob;
	
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getName() {
		
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
}
