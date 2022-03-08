package rensyu_mondai;

/**
 * 
 * @author owadataku
 * ソードクラス。
 *このクラスは勇者の武器のソードを表します。
 */

public class Sword implements Cloneable{

	/** 剣の名前*/
	private String name;
	
	/** 剣のが与えることのできるダメージ*/
	private int damage;
	
	/** 
	 * 剣の名前を設定するメソッド
	 * このメソッドを呼び出すと<b>剣の</b>名前が設定されます
	 * */
	public void  setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public Sword(String name) {
		this.name = name;
	}
	
	public Sword() {
		this.name = "名無しの剣";
	}
	
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
	
}
