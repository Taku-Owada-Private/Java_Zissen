package rensyu_mondai;

import static rensyu_mondai.KeyType.*;

public class StrongBox<E> {

	private E instance;
	private KeyType kt;
	private int getCount = 0;
	
	public void put(E instance) {
		this.instance = instance;
	}
	
//	public E get() {
//		
//		this.getCount++;
//		
//		switch(this.kt) {
//		
//		case PADLOCK:
//		if(getCount < 1024) {return null;}
//		break;
//		
//		case BUTTON:
//		if(getCount < 10000) {return null;}
//		break;
//		
//		case DIAL:
//		if(getCount < 30000) {return null;}
//		break;
//		
//		case FINGER:
//		if(getCount < 100000) {return null;}
//		break;
//		}
//		this.getCount = 0;
//		return this.instance;
//		
//		
//		}
		
		
	public E get() {
		this.getCount +=1;
		
		if(this.kt == PADLOCK) {
			if(getCount < 1024) {
				return null;
			}else {
				return this.instance;
				
			}
		}
		
		if(this.kt == BUTTON) {
			if(getCount < 10000) {
				return null;
			}else {
				return this.instance;
			}
		}
		
		if(this.kt == DIAL) {
			if(getCount < 30000) {
				return null;
			}else {
				return this.instance;
			}
		}
		
		if(this.kt == FINGER) {
			if(getCount < 1000000) {
				return null;
			}else {
				return this.instance;
			}
		}else {
			this.getCount = 0;
			return null;
		}
	}
	
	
	public StrongBox(KeyType kt) {
		this.kt = kt;
	}
	
	public StrongBox() {
		this.kt = PADLOCK;
	}
	
	
}
