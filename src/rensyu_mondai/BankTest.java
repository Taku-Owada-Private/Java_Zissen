package rensyu_mondai;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BankTest {

	//正常系　「ミヤビ」をセットできるか
	@Test
	public void setName() {
		Bank2 b = new Bank2();
		b.setName("ミヤビ");
	}
	
	
	
	//異常系　：Nullをセットしようとしたら例外が起きるか？
	
	
	@Test
	public void throwExceptionWithTwoCharName() {
		Bank2 b = new Bank2();
		assertThrows(IllegalArgumentException.class, ()->{b.setName("みや");});
	}
	
//	@Test 
//	public void setNameWithNull{
//			try {
//				Bank2 b = new Bank2();
//				b.setName(null);
//			}catch(NullPointerException e) {
//				return;
//			}
//			fail();
//		}

}


