package rensyu_mondai;
import static rensyu_mondai.AccountType.*;
import static rensyu_mondai.KeyType.*;


import javax.sound.midi.*;
import javax.sound.sampled.*;
import com.fasterxml.jackson.databind.*;
import java.util.*;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.crypto.CipherOutputStream;

import org.apache.logging.log4j.*;
import org.apache.commons.*;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import javax.xml.parsers.*;
import java.io.*;
import org.w3c.dom.*;
import java.text.*;
import java.lang.*;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;


public class Main {	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("アサートにわざと失敗します");
		assert 1 == 0;
		System.out.println("正常終了します");
		
//		
//		System.out.println("1円以上のアイテム一覧を表示します");
//		ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
//		for(Item item : items) {
//			System.out.printf('%10s%4d%4d' , item.getName(), item.getPrice(), item.getWeight());
//		}
		
/*		
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("ドライバーのロードに失敗しました");
		}
		
		Connection con = null;
		
		try {
			//STEP1
			con = DriverManager.getConnection("jdbc:h2:~/mydb");
			con.setAutoCommit(false);
			//STEP2 
			//メインの送信処理
			con.commit();
		}catch(SQLException e2) {
			e2.printStackTrace();
		}finally {
			//STEP3
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e3) {
					e3.printStackTrace();
				}
			}
		}
		
*/		
		
		
		
		
		
		
		
		
		
		
/*		
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのダウンロードに失敗しました");
		
		}
		
		Connection con = null;
		
		try {
			//STEP1　データベースの接続
			con = DriverManager.getConnection("jdbc:h2:~/mydb");
			//STEP2 SQL送信処理
			

			//STEP①
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTETRS WHERE BIRTHDAY = ?");
			//STEP②
			java.util.Date d = new java.util.Date();
			long l = d.getTime();
			Timestamp ts = new Timestamp(l);
			pstmt.setTimestamp(1, ts);
			//STEP③
			ResultSet rs = pstmt.executeQuery();
			//STEP④
			rs.close();
			pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
			//STEP3　データベース接続の切断	
				if(con != null ) {
					try {
						con.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
		
*/		
		
		
		
		
		
		
		
		
		
		
		
/*		
		//事前準備
		try {
			Class.forName("org.h2.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのダウンロードに失敗しました");
		
		}
		
		Connection con = null;
		
		try {
		//STEP1　データベースの接続
		con = DriverManager.getConnection("jdbc:h2:~/mydb");
		//STEP2 SQL送信処理
		
		//①送信すべきSQLの雛形準備
		PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
		//②雛形に値を流し込みSQL文作成
		pstmt.setInt(1, 10); 
		pstmt.setString(2, "ゾンビ"); 
		
		//組み立て終えたSQL文をDBMSに送信する
		int r = pstmt.executeUpdate();
		
		//処理結果を判定する
		if(r != 0) {
			System.out.println(r+"件のモンスターを削除しました");
		}else {
			System.out.println("該当するモンスターはありませんでした");
		}
		pstmt.close();
		//メインの処理は後述
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
		//STEP3　データベース接続の切断	
			if(con != null ) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
*/		
		
		
		
		
		
/*	
		String url = "https://api.github.com/users/miyabilink";
		HttpClient client = HttpClient.newBuilder()
				            .version(Version.HTTP_1_1)
				            .followRedirects(Redirect.NORMAL)
				            .build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url).header("Accept" , "application/vnd.github.v3+json")
							  .GET()
							  .build();
		
		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString() );
*/		
		
		
		
		
	
/*	
		Socket sock = new Socket("smtp.example.com" , 60025);
		OutputStream os = sock.getOutputStream();
		//FileInputStream fis = new FileInputStream("/Users/owadataku/eclipse-workspace/Java_Zissen/dj.ico");
		os.write("Hello smtp.example.com¥r¥n".getBytes());
		os.flush();
		sock.close();
*/	
		
		
		
		
		
		
		
		
/*	
		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("smtp.example.com")) //URLの設定
							 .PSOT(HttpRequest.BodyPublisher.)
							 .build();
*/		
		
		
		
		
		
		
		
/*		
		URL url = new URL("https://dokojava.jp/favicon.ico");
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("/Users/owadataku/eclipse-workspace/Java_Zissen/dj.ico");
		int data = is.read();
		while(data != -1) {
			os.write((byte)data);
			data = is.read();
		}
		
		os.flush();
		os.close();
		is.close();
*/		
		
		
		
		
		
		
		
//		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_1_1).followRedirects(Redirect.NORMAL).build();
//		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://example.com/movies")).GET().build();
//		HttpRequest request2 = HttpRequest.newBuilder().uri(URI.create("http://example.com/movies")).header("ContentType","application/json" )
//				               .header("Accept", "application/json").POST(HttpRequest.BodyPublisher.ofString("","")).build();
//		
		
		
/*	
		Socket sock = new Socket("https://dokojava.jp", 80);
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();
		os.write("GET /index.html HTTP/1.0¥r¥n".getBytes());
		os.write("¥r¥n".getBytes());
		os.flush();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while( i != -1) {
			System.out.print((char)i);
			i = isr.read();
		}
		
		sock.close();
*/
		
		
/*		
		URL url = new URL("https://dokojava.jp");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while( i != -1) {
			System.out.print((char)i);
			i = isr.read();
		}
		
		isr.close();
*/		
		
		
		
		
		
/*
		Employee e1 = new Employee();
		e1.name = "田中太郎";
		e1.age = 41;
		
		Department d1 = new Department();
		d1.name = "総務部";
		d1.leader = e1;
		
		FileOutputStream fos = new FileOutputStream("/Users/owadataku/eclipse-workspace/Java_Zissen/java_rensyu.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.flush();
		oos.close();
*/		
		
		

	
		
		}
}
