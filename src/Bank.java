import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bank {

	public static void main(String args[]) throws IOException {
		SBI sbi = new SBI();
			Customer[] allcustomer = sbi.getallcustomer();
			System.out.println(allcustomer);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to open account? Yes/No");
		String choice = sc.nextLine();
		if (choice.equals("Y")) {
			Customer c = new Customer();

			System.out.println("Enter your account number:-");
			c.setAccountNumber(sc.nextInt());

			System.out.println("Enter your name:-");
			sc.nextLine();
			c.setName(sc.nextLine());

			System.out.println("Enter your Date of birth:-");
			c.setDob(sc.nextLine());

			System.out.println("Enter your Balance:-");
			c.setBalance(sc.nextDouble());

			System.out.println(c.getBalance());
			
			FileWriter myWriter = new FileWriter("SavingAccount.txt");
			myWriter.write("Your account number is" + c.getAccountNumber() + "Your name is " + c.getName()
					+ "Your balance is" + c.getBalance() + " Date of Birth:-" + c.getDob());
			myWriter.close();

			System.out.println("Select the bank which you want 1. SBI, 2.ICICI, 3. PNB");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Welcome to State Bank of India.");
				System.out.println("Which type of account do you want 1. Saving Account 2. Cuurent Account");
				int type = sc.nextInt();

				if (type == 1) {
					System.out.println("Saving Account");
					System.out.println("Do you want to calculte the interest");
					String interest = sc.nextLine();
					if(interest.equals("Y")) {
						Account a = new Account();
						a.SavingAccount();	
					}
					
				} else if (type == 2) {
					System.out.println("Current Account");
					System.out.println("Do you want to calculte the interest");
					String interest = sc.nextLine();
					if(interest.equals("Y")) {
						Account b = new Account();
						b.CurrentAccount();	
					}
					
				} else {
					System.out.println("Invalid choice !!!!!");
				}
			}

			else if (ch == 2) {
				System.out.println("Welcome to ICICI Bank of India.");
				System.out.println("Which type of account do you want 1. Saving Account 2. Cuurent Account");
				int type = sc.nextInt();

				if (type == 1) {
					System.out.println("Saving Account");
					System.out.println("Do you want to calculte the interest");
					String interest = sc.nextLine();
					if(interest.equals("Y")) {
						Account a = new Account();
						a.SavingAccount();	
					}
					
				} else if (type == 2) {
					System.out.println("Current Account");
					System.out.println("Do you want to calculte the interest");
					String interest = sc.nextLine();
					if(interest.equals("Y")) {
						Account b = new Account();
						b.CurrentAccount();	
					}
					
				} else {
					System.out.println("Invalid choice !!!!!");
				}
			} else if (ch == 3) {
				System.out.println("Welcome to Punjab National Bank.");
				System.out.println("Which type of account do you want 1. Saving Account 2. Cuurent Account");
				int type = sc.nextInt();

				if (type == 1) {
					System.out.println("Saving Account");
					System.out.println("Do you want to calculte the interest");
					String interest = sc.nextLine();
					if(interest.equals("Y")) {
						Account a = new Account();
						a.SavingAccount();	
					}
					
				} else if (type == 2) {
					System.out.println("Current Account");
					String interest = sc.nextLine();
					System.out.println("Do you want to calculte the interest");
					
					if(interest.equals("Y")) {
						Account b = new Account();
						b.CurrentAccount();	
					}
					
				} else {
					System.out.println("Invalid choice !!!!!");
				}
			}

			else {
				System.out.println("Invalid choice!!!" + " " + "Try Again.");
			}

			System.out.println("Your bank account is open successfully");

		}
		

	}
}
