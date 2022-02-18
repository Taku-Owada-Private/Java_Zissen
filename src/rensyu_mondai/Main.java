package rensyu_mondai;
import static rensyu_mondai.AccountType.*;
import static rensyu_mondai.KeyType.*;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.text.SimpleDateFormat;
public class Main {	

	public static Integer len (String s) {
		return s.length();
	}
	
	public static void main(String[] args) {
		
		//lenメソッドの処理ロジックを、変数funcに代入する
		Function<String, Integer> func = Main::len;
		
		//変数funcに格納されている処理ロジックを、引数"Java"で実行する
		int a = func.apply("Java");
		System.out.println("文字列「java」は"+ a + "文字です");
		
		Consumer<String> func2 = System.out::println;
		func2.accept("Hello , World");
		
		Supplier<String> func3 = System::lineSeparator;
		System.out.println("改行します" + func3.get() );
		
		BiFunction<String , String , String> func4 = System::getProperty;
		System.out.println(func4.apply("java.version", "不明"));
		
	}
	
	

}
