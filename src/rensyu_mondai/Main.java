package rensyu_mondai;

public class Main {
//こっちがトピック
	public static void main(String[] args) {
		
		
		Hero h1 = new Hero("minato");
		Sword s = new Sword("鋼の剣");
		
		
		h1.setSword(s);
		System.out.println("h1の装備:"+h1.getSword().getName());
		System.out.println("clone()で複製します");
		Hero h2 = h1.clone(); 
		
		System.out.println("コピー元の勇者の剣の名前を変えます");
		s.setName("ヒノキの棒");
		System.out.println(h1.getSword().getName());
		System.out.println("コピー元とコピー先の勇者の装備の名前を表示します");
		System.out.println("コピー元："+h1.getSword().getName()+"/コピー先："+h2.getSword().getName());
	}

}
