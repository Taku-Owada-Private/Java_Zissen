package rensyu_mondai;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Bank {
	
	String name;
	String address;
	
	
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	
	
	public int hachCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
/*	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Bank))return false;
		Bank r = (Bank)o;
		if(!this.name.equals(r.name))return false;
		if(!this.address.equals(r.address))return false;
		return true;
	}
*/

}
