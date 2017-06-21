package homework6_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 1��ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
 * 2��ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С�
 * 3�����е��ļ���Ŀ¼Ҫ��ʹ��File�����д�����
 */
public class Work1 {
	private static File file = new File("D:\\io��\\myio\\write.txt");
	private static File file1 = new File("D:\\io��\\myio\\write");
	private static File file2 = new File("D:\\io��\\myio\\write\\write.txt");
	private static Reader rd = null;
	private static Writer wt = null;
	private static char []ch=new char[1024];

	static {
		try {
			rd = new FileReader(file);
			wt = new FileWriter(file2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Reader��ȡ��Writerд��ķ�����-��
	public static void read1() {
		int length = 0;
		try {
			while ((length = rd.read()) != -1) {
				System.out.print((char) length);
				wt.write(length);
				wt.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Reader��ȡ��Writerд��ķ���������
	public static void read2() {
		int length=0;
		try {
			while((length=rd.read(ch))!=-1){
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
					wt.write(ch[i]);
					wt.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Reader��ȡ��Writerд��ķ���������
	public static void read3() {
		int length=0;
		try {
			while((length=rd.read(ch,0,ch.length))!=-1){
				for(int i=0;i<length;i++){
					System.out.print(ch[i]);
					wt.write(ch[i]);
					wt.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �����ļ���Ŀ¼�ķ���
	public static void getFile() {
		// ����D:\\io��\\myio�µ�write.txt�ļ�
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println(file.getName() + "�����ɹ���");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file.getName() + "�Ѵ���");
		}
		// ����D:\\io��\\myio�µ�writeĿ¼
		if (!file1.exists()) {
			file1.mkdir();
			System.out.println(file1.getName() + "�����ɹ���");
		} else {
			System.out.println(file1.getName() + "�Ѵ���");
		}
		// ����D:\\io��\\myio\\write�µ�write.txt�ļ�
		if (!file2.exists()) {
			try {
				file2.createNewFile();
				System.out.println(file2.getName() + "�����ɹ���");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file2.getName() + "�Ѵ���");
		}
	}
	public static void close(){
		if(rd!=null&&wt!=null){
			try {
				rd.close();
				wt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		getFile();
//		read1();
//		read2();
		read3();
		close();
	}
}
