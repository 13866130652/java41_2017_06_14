package zuoye;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class Test {
	private static File dir = new File("D:\\myio");
	private static File f = new File("D:\\myio\\write.txt");
	private static File t = new File("D:\\myio\\write");
	private static Reader r = null;
	private static Writer w = null;
	
	static{
		if(!dir.exists()){
			dir.mkdir();
		}
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(!t.exists()){
			t.mkdir();
		}
		
		try {
			r = new FileReader(f);
			w = new FileWriter("D:\\myio\\write\\write.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Reader
	public static void read1(){
		int date = 0;
		try {
			while((date = r.read()) != -1){
				System.out.print((char)date);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void read2(){
		char[] ch = new char[6];
		int length = 0;
		try {
			while((length = r.read(ch)) != -1){
				for(int i = 0; i < length;i++){
					System.out.print(ch[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void read3(){
		char[] ch = new char[6];
		int length = 0;
		try {
			while((length = r.read(ch,0,3)) != -1){
				for(int i = 0; i < length;i++){
					System.out.print(ch[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//writer
	public static void write1(){
		int date = 0;
		try {
			while((date = r.read()) != -1){
				w.write(date);
			}
			w.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void write2(){
		char[] ch = new char[6];
		int length = 0;
		try {
			while((length = r.read(ch)) != -1){
				w.write(ch,0,length);
			}
			w.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void write3(){
		StringBuffer sb = new StringBuffer("");
		char[] ch = new char[6];
		int length = 0;
		try {
			while((length = r.read(ch)) != -1){
				for(int i = 0; i < length;i++){
					sb.append(ch[i]);
				}
			}
			String st = sb.toString();
			w.write(st);
			w.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(){
		try{
		if(r != null){
			r.close();
		}
		if(w != null){
			w.close();
		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		read1();
		//read2();
		//read3();
		//write1();
		//write2();
		//write3();
		close();
	}
}
