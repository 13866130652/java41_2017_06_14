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
//1���������롢���������
	private static InputStream is = null;
	private static OutputStream os = null;
	// 2�� �ֽڻ������飬�Ѷ�ȡ�������ݴ�ŵ�b������
	private static byte b[] = new byte[1024];
// 3������д����
public static void translate(String origin, String target) {
	try {
		is = new FileInputStream(origin);
		os = new FileOutputStream(target);
		int date = 0;
		while ((date = is.read(b)) != -1) {
			os.write(b, 0, date);
		}
		os.flush();// ��ջ���
		System.out.println("���ݸ��Ƴɹ���");
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

//�������ַ�
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

//5������Ŀ¼
	public static void createDirectory(String path) {
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("����Ŀ¼" + path + "�ɹ�");
			}
		} else {
			System.out.println("Ŀ��·��" + path + "�Ѵ���");
		}
	}

	// 6�������ļ�
	public static void createFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("�����ļ�" + file.getName() + "�ɹ�");
				}
			} catch (Exception e) {
			}
		} else {
			System.out.println("Ŀ���ļ�" + path + "�Ѵ���");
		}
	}
public static void main(String[] args) {
	// 1������Ŀ¼
		createDirectory("D:/myio");
		// 2������test.txt�ļ�
		createFile("D:/myio/write.txt");
		//fuzhi
		translate("D:/myio/text.txt", "D:/myio/write.txt");
		
		//reader1();
		//reader2();
		reader3();
}
}
