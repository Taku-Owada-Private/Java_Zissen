package rensyu_mondai;

public class Account {
	
	private String accountNo;
	private int zandaka;
	private AccountType accountType;
	
	public Account(String accountNo , int zandaka , AccountType aType) {
		this.accountNo = accountNo;
		this.zandaka = zandaka;
		this.accountType = aType;
	}

}
