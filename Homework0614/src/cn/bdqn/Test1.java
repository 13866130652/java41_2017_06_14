package cn.bdqn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test1 {
	private static File file = new File("D:\\myio\\write.txt");
	private static File f = new File("D:\\myio\\write\\write.txt");
	private static Writer wt = null;
	private static Reader rd = null;
	public static char[] ch = new char[1024];

	static {
		try {
			wt = new FileWriter(f, true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void know() {
		if (!f.exists()) {
			if (f.mkdir()) {
				System.out.println("创建目录" + f + "成功");
			}
		} else {
			System.out.println("目标路径" + f + "已存在");
		}
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("创建目录" + file + "成功");
			}
		} else {
			System.out.println("目标路径" + file + "已存在");
		}
	}

	public static void show1() {
	
		try {
			rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				wt.write(ch, 0, data);
				wt.flush();
				wt.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void show2(){
		try {
			rd=new FileReader(file);
			int data=0;
			while((data=rd.read(ch,0,ch.length))!=-1){
				wt.write(ch,0,data);
				wt.flush();
				wt.close();	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		know();
		show2();

	}

}
