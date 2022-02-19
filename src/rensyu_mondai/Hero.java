package rensyu_mondai;

import java.util.Objects;

public class Hero implements Cloneable {

	private String name;
	private int hp,mp;
	private Sword sword;
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp ;
	}
	
	
	public void setSword(Sword sword) {
		this.sword= sword;
	}
	
	public Sword getSword() {
		return this.sword;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "勇者（名前＝"+this.name+"/HP"+this.hp+"/MP="+this.mp+"）";
	}
	
	public int hashCode() {
		return Objects.hash(this.name,this.hp);
	}
	
	public Hero () {
		
	}
	public Hero(String name, int hp , int mp) {
		this.name = name;
		this.hp =  hp;
		this.mp = mp;
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	public Hero clone() {
		Hero result = new Hero();
		result.name= this.name;
		result.hp= this.hp;
		result.sword= this.sword.clone();
		return result;
	}
}

