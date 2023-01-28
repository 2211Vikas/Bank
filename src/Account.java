import java.util.Scanner;

public class Account {
	
	double SavingAccount(){
//		A = P(1 + rt)
		SBI s = new SBI();
		Customer c =new Customer();
		Scanner sc = new Scanner(System.in);
		double SI;
		System.out.println("Give the time in year to calculate the interest");
		float time =sc.nextInt();
		SI = c.getBalance()*(1+(s.rateofInterestforSaving()*time));
		
		double interest = SI-c.getBalance();
		System.out.println("The total interest is"+interest);
		System.out.println("The total interest is"+c.getBalance());
		System.out.println("The total interest is"+s.rateofInterestforSaving());
//		System.out.println("The total interest is"+SI);
		return interest;
		
	}
	double CurrentAccount() {
		SBI s = new SBI();
		Customer c =new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the time in year to calculate the interest");
		float time =sc.nextInt();
//		𝐴 = 𝑃(1+𝑟𝑛)𝑛𝑡
		double CI;
		CI = Math.pow((c.getBalance()*(1+(s.minimumBalanceforCurrent()*2))),(time*2));
		double interest = CI- c.getBalance();
		return interest;
		
	}
}
