package rensyu_mondai;

public class Account2 {

	public String owner;
	public int zandaka;
	
	public  Account2(String owner, int zandaka) {
		
		this.owner = owner;
		this.zandaka = zandaka;
	}
	
	public void transfer(Account2 dest , int amount) {
		dest.zandaka += amount;
		zandaka -= amount; 
		assert this.zandaka >= 0 : "負の残高"+ this.zandaka;
	}
}
