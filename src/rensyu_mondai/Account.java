package rensyu_mondai;

public class Account {
	
	private String accountNo;
	private int zandaka;
	private AccountType accountType;
	
	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}
	
	public  int getZandaka() {
		return this.zandaka;
	}
	
	public Account(String accountNo , int zandaka , AccountType aType) {
		this.accountNo = accountNo;
		this.zandaka = zandaka;
		this.accountType = aType;
	}

}
