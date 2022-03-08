package rensyu_mondai;




public class Item {

	
	//public record Item(String name, int price , int weight) {}
	
	

	private String name;
	private int price;
	private int weight;
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int p) {
		this.price = p;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int w) {
		this.weight = w;
	}
	

	
}
