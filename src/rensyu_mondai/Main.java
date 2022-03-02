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
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {	
	
	public static void main(String[] args)throws Exception {
		
//		
//		Socket sock = new Socket("smtp.example.com" , 60025);
//		OutputStream os = sock.getOutputStream();
//		FileInputStream fis = new FileInputStream("/Users/owadataku/eclipse-workspace/Java_Zissen/dj.ico");
//		os.write(fis);
//		
//		
		
		
		
		
		
		
		
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
