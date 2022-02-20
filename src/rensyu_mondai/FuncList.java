package rensyu_mondai;

public class FuncList {

	public static boolean isOdd(Integer x) {
		return (x % 2  == 1);
	}
	
	public String passCheck(int point , String name) {
		return name + "さんは" + (point>65 ? "合格" : "不合格");
	}
}
