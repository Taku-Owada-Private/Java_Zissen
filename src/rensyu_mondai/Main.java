package rensyu_mondai;
import static rensyu_mondai.AccountType.*;
import static rensyu_mondai.KeyType.*;

import java.util.*;
import java.util.function.*;
import java.text.SimpleDateFormat;
public class Main {	
	
	public static void main(String[] args) {
		
		
		List<Hero> heroes = new ArrayList<>();
		
		boolean anyoneKnockedOut =  heroes.stream().anyMatch(h -> h.getHp() == 0);
		
		
		List<Account> list = new ArrayList<>();
		
		Collections.sort(list , (x,y)->(x.getZandaka() - y.getZandaka()));
		
		
		IntToDoubleFunction func = (int x) -> {
			return  x * x * 3.14;
		};
		
		System.out.println(func.applyAsDouble(1));
		
		IntToDoubleFunction func2 = (x) -> {
			return x * x * 3.14;
		};
		
		IntToDoubleFunction func3 =   x -> {
			return x * x * 3.14;
		};
		
		IntToDoubleFunction func4 =   x ->  x * x * 3.14;
		
		double b = 3.14;
		IntToDoubleFunction func5 = (int x) -> {
			return x * x * b ;
		};
		
		
		//例１　勇者インスタンスを受け取り、そのHPを返す
		// (Hero h) -> {return h.getHp();}
		
		//例２　何も受け取らず、現在日時を返す
		//() -> {return new java.util.Date();}
		
		//例3　long配列を受け取り、そのコピーを作り、内容を並び替えて返す
//		(long[] org) -> {
//			long[] cpy = java.util.Arrays.copyOf(org , org.length);
//			java.util.Arrays.sort(cpy);
//			return cpy;
//			
//		}
		
		//例４　関数オブジェクトを受け取り、２回呼び出した合計を返す
//		(IntBinaryOperator func , int a , int b) -> {
//			int result = func.applyAsInt(a, b) + func.applyAsInt(a,b);
//			return result;
//		}
		
//		Function<String , Integer> func = (String s) -> {return s.length();};
//		int n = func.apply("Java");
//		System.out.println("文字列「Java」は"+ n + "文字です");
//		
		
		
//		//lenメソッドの処理ロジックを、変数funcに代入する
//		Function<String, Integer> func = Main::len;
//		
//		//変数funcに格納されている処理ロジックを、引数"Java"で実行する
//		int a = func.apply("Java");
//		System.out.println("文字列「java」は"+ a + "文字です");
//		
//		Consumer<String> func2 = System.out::println;
//		func2.accept("Hello , World");
//		
//		Supplier<String> func3 = System::lineSeparator;
//		System.out.println("改行します" + func3.get() );
//		
//		BiFunction<String , String , String> func4 = System::getProperty;
//		System.out.println(func4.apply("java.version", "不明"));
		
	}
	
	

}
