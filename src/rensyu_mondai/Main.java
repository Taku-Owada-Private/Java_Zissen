package rensyu_mondai;
import static rensyu_mondai.AccountType.*;
import static rensyu_mondai.KeyType.*;

import java.util.*;
import java.text.*;
public class Main {	
	
	public static void main(String[] args) {
		
		//Stringに関する情報を取得して表示する
		Class<?> info1 = String.class;
		
	long f = Runtime.getRuntime().freeMemory()/1024/1024;
	System.out.println(f);
		
		TimeZone tz = TimeZone.getDefault();
		System.out.println("現在のタイムゾーン：");
		System.out.println(tz.getDisplayName());
		if(tz.useDaylightTime()){
			System.out.println("夏時間を採用しています");
		}else {
			System.out.println("夏時間を採用していません");
		}
		
		System.out.println("世界標準時間との時差は");
		System.out.println(tz.getRawOffset()/ 3600000 + "時間");
	

	}

}
