package rensyu_mondai;

public class AccountTest {

	public static void main(String[] args) {
		
		testInstantiate();
		testTransfer();
	}
	
	private static void testInstantiate() {
		System.out.println("Account2をnewできるかテストします");
		Account2 a = new Account2("ミナト", 30000);
		if(!"ミナト".equals(a.owner)) {
			System.out.println("失敗！！　名義人がおかしい");
		}
		if(30000 != a.zandaka) {
			System.out.println("失敗！！　残高がおかしい！！");
		}
		System.out.println("テストを終了します");
		
		
	}
	
	private static void testTransfer() {}
	

}
