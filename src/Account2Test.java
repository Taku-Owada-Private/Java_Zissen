import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rensyu_mondai.Account2;

class Account2Test {

	@Test
	public void instantiate() {
		Account2 a = new Account2("ミナト", 30000);
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.zandaka);
	}
	@Test 
	public void transfer() {}

}
