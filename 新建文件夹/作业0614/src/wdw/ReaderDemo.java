package wdw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class ReaderDemo {
public static File file=new File("D:\\myio\\write.txt");
//1、创建输入、输出流对象
	private static InputStream is = null;
	private static OutputStream os = null;
	// 2、 字节缓冲数组，把读取到的数据存放到b数组中
	private static byte b[] = new byte[1024];
// 3、读、写数据
public static void translate(String origin, String target) {
	try {
		is = new FileInputStream(origin);
		os = new FileOutputStream(target);
		int date = 0;
		while ((date = is.read(b)) != -1) {
			os.write(b, 0, date);
		}
		os.flush();// 清空缓存
		System.out.println("数据复制成功！");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void reader1(){
	try {
		char[]ch=new char[1024];
		Reader reader=new FileReader(file);
		int length=0;
		while((length=reader.read(ch))!=-1){
			//System.out.print((char)date);
			
			for (int i = 0; i < length; i++) {
				System.out.print(ch[i]);
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

//读单个字符
public static void reader2(){
	Reader rd=null;
	try {
		rd=new  FileReader(file);
		int date=0,i=0;

		while((date=rd.read())!=-1){
			System.out.print((char)date);
		}
	}
	 catch (Exception e) {
		
		e.printStackTrace();
	}
}

public static void reader3(){
	try {
		char[]ch=new char[1024];
		Reader reader=new FileReader(file);
		int date=0;
		while((date=reader.read(ch, 3, ch.length-4))!=-1){
			//System.out.print((char)date);
			for (int i = 0; i < date; i++) {
				System.out.print(ch[i]);
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

//5、创建目录
	public static void createDirectory(String path) {
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("创建目录" + path + "成功");
			}
		} else {
			System.out.println("目标路径" + path + "已存在");
		}
	}

	// 6、创建文件
	public static void createFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("创建文件" + file.getName() + "成功");
				}
			} catch (Exception e) {
			}
		} else {
			System.out.println("目标文件" + path + "已存在");
		}
	}
public static void main(String[] args) {
	// 1、创建目录
		createDirectory("D:/myio");
		// 2、创建test.txt文件
		createFile("D:/myio/write.txt");
		//fuzhi
		translate("D:/myio/text.txt", "D:/myio/write.txt");
		
		//reader1();
		//reader2();
		reader3();
}
}
