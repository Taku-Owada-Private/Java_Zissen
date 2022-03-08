package rensyu_mondai;
/**
 *銀行クラス
 * @author takuowada
 * @see 特になし
 * */
public class Bank2 {

	/** 銀行の名前です*/
	private String name;
	
	 public String getName() {
		 return this.name;
	 }
	
	
	public void setName(String newName) {
		if(newName.length() < 3) {
			throw new IllegalArgumentException("名前が不正です");
		}
		this.name = newName;
	}
	

}
