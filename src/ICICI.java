
public class ICICI extends RBI {
	private Customer[] getallcustomer;
	
	public Customer[] getallcustomer() {
		Customer C1 = new Customer();
		C1.setAccountNumber(115610);
		C1.setName("Kundan");
		C1.setDob("sep 1982");
		C1.setBalance(20009800);
		Customer C2 = new Customer();
		C2.setAccountNumber(1012);
		C2.setName("Sundan");
		C2.setDob("sep 1988");
		C2.setBalance(2000979);
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
