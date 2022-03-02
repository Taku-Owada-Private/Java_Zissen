package rensyu_mondai;
import static rensyu_mondai.KidouHou.*;
import java.lang.reflect.*;
import java.lang.runtime.*;

public class Launcher {
	
	public static void main (String[] args) {
		String fcqn = args[0];
		String sw = args[1];
		showMemory();
		
		try {
			Class<?> clazz = Class.forName(fcqn);
			ListMethods(clazz);
			if(sw.equals("E")) {
				launchExternal(clazz);
			}else if(sw.equals("I")) {
				launchInternal(clazz);
			}else {
				throw new IllegalArgumentException("起動方法の指定が不正です");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		
		showMemory();
		System.exit(0);
		
	}
	
	public static void launchInternal(Class<?> clazz)throws Exception {
		Method m = clazz.getMethod("main", String[].class);
		String[] args = {};
		m.invoke(null, (Object)args);
	}
	
	public static void launchExternal(Class<?> clazz)throws Exception{
		ProcessBuilder pb = new ProcessBuilder("java",clazz.getName());
		Process proc = pb.start();
		proc.waitFor(); //プロセスの終了まで待つ
	}
	
	public static void showMemory() {
		long free = Runtime.getRuntime().freeMemory();
		long total = Runtime.getRuntime().totalMemory();
		long usage= (total - free)/1024/1024;
		System.out.println("現在の使用量は"+usage+"です");
		
	}
	
	public static void ListMethods(Class<?> clazz) {
		System.out.println("メソッドの一覧を表示します");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m: methods) {
			System.out.println(m.getName());
		}
	}
	
	
	
	
}

//	//問題２
//   static public void showMemoryUsage(){
//		System.out.println("まず現在のJavaのメモリ使用量を表示します：");
//		System.out.println(Runtime.getRuntime().totalMemory());
//	}
//	
//   	//問題３
//	static public void showFcqnMethods(String cname)throws Exception{
//		Class<?> cinfo = Class.forName(cname);
//		Method[] methods = cinfo.getDeclaredMethods();
//		System.out.println(methods);
//	}
//	
//	//問題４
//	static public void execute(KidouHou a){
//		if(a == E) {
//			ProcessBuilder pb = new ProcessBuilder();
//		}else if(a == I) {
//			
//		}
//	}
//	
//	//問題５
//	static public void showMemoryUsageMB() {
//		System.out.println("現在のJavaのメモリ使用量をMB単位で表示します：");
//		System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
//	}
//}
