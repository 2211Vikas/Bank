
public class SBI extends RBI{
	
	private Customer[] getallcustomer;
	
	public Customer[] getallcustomer() {
		Customer C1 = new Customer();
		C1.setAccountNumber(1110);
		C1.setName("Sunil");
		C1.setDob("sep 1987");
		C1.setBalance(200000);
		Customer C2 = new Customer();
		C2.setAccountNumber(111012);
		C2.setName("Ashish");
		C2.setDob("sep 2000");
		C2.setBalance(20000);
		getallcustomer = new Customer[2];
		getallcustomer[0]=C1;
		getallcustomer[1]=C2;
		return getallcustomer;
		
	}
	

	@Override
	int rateofInterestforSaving() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	int rateofInterestforCurrent() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	int minimumBalanceforSaving() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	int minimumBalanceforCurrent() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
