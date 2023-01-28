
public class PNB extends RBI{
	private Customer[] getallcustomer;
	
	public Customer[] getallcustomer() {
		Customer C1 = new Customer();
		C1.setAccountNumber(11230);
		C1.setName("shumakar");
		C1.setDob("Dec2000");
		C1.setBalance(980070);
		Customer C2 = new Customer();
		C2.setAccountNumber(198012);
		C2.setName("Rahul");
		C2.setDob("sep 1999");
		C2.setBalance(4678);
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
