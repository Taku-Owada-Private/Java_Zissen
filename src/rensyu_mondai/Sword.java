package rensyu_mondai;

public class Sword implements Cloneable{

	private String name;
	private int damage;
	
	
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
