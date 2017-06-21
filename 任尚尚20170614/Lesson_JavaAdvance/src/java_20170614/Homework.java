package java_20170614;

import java.io.*;
/**
 * @author ������
 * 1��ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
 * 2��ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С�
 * 3�����е��ļ���Ŀ¼Ҫ��ʹ��File�����д�����
 */
public class Homework {
	//�ļ�
	private static File fileOrigin = new File("D:\\myio\\write.txt");
	private static File fileTarget = new File("D:\\myio\\write\\write.txt");
	//��ȡ������
	private static Reader reader = null;
	//д��������
	private static Writer writer = null;
	
	/*����������������*/
	//����Ŀ¼
	public static void createDirectory(String path){
		File dire = new File(path);
		if (!dire.exists()) {// �����ڸ�Ŀ¼
			System.out.println("�����ڸ�Ŀ¼!");
			Boolean create = dire.mkdir();// ����·������ȡ����ֵ
			if (create) {
				System.out.println("�ɹ�����Ŀ¼" + dire.getPath());
			}
		} else {// ���ڸ�·��
			System.out.println("Ŀ¼�Ѵ��ڣ�");
		}
	}
	//�����ļ�
	public static void createFile(String path){
		File file = new File(path);
		if (!file.exists()) {// �����ڸ��ļ�
			System.out.println("�����ڸ��ļ�!");
			Boolean create;
			try {
				create = file.createNewFile();// �������ļ�����ȡ����ֵ
				if (create) {
					System.out.println("�ɹ������ļ�" + file.getPath());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {// ���ڸ��ļ�
			System.out.println("�ļ��Ѵ���!");
		}
	}
	
	//ΪD:\myio\write.txtд���ʼ����
	public static void firstWords(){
		String inWords = "abcdefghijklmnopqrstuvwxyz"+" ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+" 1234567890"+" Ҽ��������½��ƾ�ʰ";
		try {
			writer = new FileWriter(fileOrigin);
			writer.write(inWords);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*����������ȡ����*/
	//read1,�����ַ���ȡ
	public static String read1(File file){
		System.out.println("****************read 1****************");
		StringBuffer sb = new StringBuffer();
		try {
			reader = new FileReader(file);
			int date = 0;
			while((date=reader.read())!=-1){
				sb.append((char)date);
			}
			System.out.println(sb);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	//read2���ַ������ȡ
	public static String read2(File file){
		System.out.println("****************read 2****************");
		int length = 0;
		char[] ch = new char[10];
		StringBuffer sb = new StringBuffer();
		try {
			reader = new FileReader(file);
			while((length=reader.read(ch)) != -1){
				for(int i=0;i<length;i++){
					sb.append(ch[i]);
				}
			}
			System.out.println(sb);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	//read3���ַ������ȡ���޶���Χ
	public static String read3(File file){
		System.out.println("****************read 3****************");
		int length = 0;
		char[] ch = new char[10];
		StringBuffer sb = new StringBuffer();
		try {
			reader = new FileReader(file);
			while((length=reader.read(ch, 0, ch.length-3)) != -1){
				for(int i=0;i<length;i++){
					sb.append(ch[i]);
				}
			}
			System.out.println(sb);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	/*��������д�뷽��*/
	/*����Ϊwrite1����ļ���д��,write2��write3ƴ�ӵ�write1��,ʹÿ�����к�����ͬ*/
	//write1,�ַ���д��,����ԭ������
	public static void write1(File file, String st){
		System.out.println("****************write1****************");
		try {
			writer = new FileWriter(file);
			writer.write(st);
			writer.flush();
			writer.close();
			System.out.println("д��ɹ�!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//write2,�ַ�����д��,ƴ��ԭ������
	public static void write2(File file, String st){
		System.out.println("****************write2****************");
		char ch[] = st.toCharArray();
		try {
			writer = new FileWriter(file,true);
			writer.write(ch);
			writer.flush();
			writer.close();
			System.out.println("д��ɹ�!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//write3,ָ�����ַ���������д��,ƴ��ԭ������
	public static void write3(File file, String st){
		System.out.println("****************write3****************");
		char ch[] = st.toCharArray();
		try {
			writer = new FileWriter(file,true);
			//����ǰ���,���st.length()-10��(ȥ�������)
			writer.write(ch, 5, st.length()-10);
			writer.flush();
			writer.close();
			System.out.println("д��ɹ�!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//main����
	public static void main(String[] args) {
		//����
		createDirectory("D:\\myio");
		createDirectory("D:\\myio\\write");
		createFile("D:\\myio\\write.txt");
		createFile("D:\\myio\\write\\write.txt");
		
		//��ȡ
		firstWords();//��ʼ������
		String st1 = read1(fileOrigin);
		
		firstWords();//��ʼ������(�ļ��ѱ���ȡ�������¸�ֵ)
		String st2 = read2(fileOrigin);
		
		firstWords();//��ʼ������(�ļ��ѱ���ȡ�������¸�ֵ)
		String st3 = read3(fileOrigin);
		
		//д��
		write1(fileTarget,st1);
		write2(fileTarget,"\r\n"+st2+"\r\n");//"\r\n"���ڻ���,�������ֲ�ͬ���뷽�����
		write3(fileTarget,st3);
		
		System.out.println("��лʹ��!");
	}
	
}
