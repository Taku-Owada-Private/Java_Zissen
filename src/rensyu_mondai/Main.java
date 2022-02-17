package rensyu_mondai;
import static rensyu_mondai.AccountType.*;
import static rensyu_mondai.KeyType.*;

import java.util.*;
import java.text.SimpleDateFormat;
public class Main {	

	
	public static void main(String[] args) {
		
		StrongBox<String> sb = new StrongBox<>();
		sb.put("123");
		System.out.println(sb.get());
		
		StrongBox<Integer> sb2 = new StrongBox<Integer>();
		sb2.put(123);
		System.out.println(sb2.get());
		
		
		
		
		
//		Optional <String> s = decorate("",'*');
//		System.out.println(s.orElse("nullのため処理できません"));
//		
		
		
		
		
		
		
//		Optional<String> op1 = Optional.ofNullable("ミナト");
//		System.out.println(op1);
//		
//		Optional<String> op2 = Optional.ofNullable(null);
//		System.out.println(op2);
//		
//		
//		System.out.println(op1.isPresent());
//		System.out.println(op2.isPresent());
//		
//		System.out.println("勇者"+op1.get());
//		//System.out.println("勇者"+op2.get());
//		
//		System.out.println("勇者"+op1.orElse("名無し"));
//		System.out.println("勇者"+op2.orElse("名無し"));
		
//		Pocket <Object> pocket = new Pocket<>();
//		System.out.println("使い捨てのインスタンスを作り、pocketに入れます");
//		
//		pocket.put(new Object(){
//			String innerField;
//			void innerMethod() {}
//		});
//		Outer.Inner ic = new Outer.Inner();
//		System.out.println("test");
		
		//Account a = new Account("123456789", 99999999, FUTSU);
		
//		Pocket<String> p = new Pocket();
//		p.put("1192");
//		String s = p.get();
//		System.out.println(s);
//		
		
		
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
//		List<Book> books = new ArrayList<>();
//		
//		Book b1 = new Book();
//		b1.setTitle("Java入門");
//		b1.setPublisherDate(f.parse("2011/10/17"));
//		b1.setComment("スッキリ分かる");
//		
//		
//		
//		Book b2 = new Book();
//		b2.setTitle("Python入門");
//		b2.setPublisherDate(f.parse("2019/6/11"));
//		b2.setComment("カレー食べたよ");
//		
//		Book b3 = new Book();
//		b3.setTitle("C言語入門");
//		b3.setPublisherDate(f.parse("2018/6/21"));
//		b3.setComment("ポインタも自由自在");
//		
//		books.add(b1);
//		books.add(b2);
//		books.add(b3);
//		
//		Collections.sort(books, new TitleComparator());
//		
		
//		System.out.println(books);
		
//		for(Book b : books) {
//			System.out.println(b);
//		}
//		
//		
//		Collections.sort(books);
		
//		System.out.println(books);
		
//		for(Book b : books) {
//			System.out.println(b);
//		}
		
//		System.out.println(b1.getTitle());
//		System.out.println(b2.getTitle());
//		System.out.println(b1.getPublisherDate());
//		System.out.println(b2.getPublisherDate());
//		System.out.println(b1.hashCode());
//		System.out.println(b2.hashCode());
//		System.out.println(b1.equals(b2));
//		System.out.println(b1 == b2);
		
		
//		List<Book> list = new ArrayList<>();
//		list.add(b1);
//		list.add(b2);
//		Collections.sort(list);
//		System.out.println(list);
		
		
		
		
//		Hero h1 = new Hero("minato");
//		Sword s = new Sword("鋼の剣");
//		
//		
//		h1.setSword(s);
//		System.out.println("h1の装備:"+h1.getSword().getName());
//		System.out.println("clone()で複製します");
//		Hero h2 = h1.clone(); 
//		
//		System.out.println("コピー元の勇者の剣の名前を変えます");
//		s.setName("ヒノキの棒");
//		System.out.println(h1.getSword().getName());
//		System.out.println("コピー元とコピー先の勇者の装備の名前を表示します");
//		System.out.println("コピー元："+h1.getSword().getName()+"/コピー先："+h2.getSword().getName());
	}
	
	

}
