package java_20170614;

import java.io.*;
/**
 * @author 任尚尚
 * 1、使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台。
 * 2、使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中。
 * 3、所有的文件、目录要求使用File语句进行创建。
 */
public class Homework {
	//文件
	private static File fileOrigin = new File("D:\\myio\\write.txt");
	private static File fileTarget = new File("D:\\myio\\write\\write.txt");
	//读取流对象
	private static Reader reader = null;
	//写入流对象
	private static Writer writer = null;
	
	/*以下两个创建方法*/
	//创建目录
	public static void createDirectory(String path){
		File dire = new File(path);
		if (!dire.exists()) {// 不存在该目录
			System.out.println("不存在该目录!");
			Boolean create = dire.mkdir();// 创建路径，获取返回值
			if (create) {
				System.out.println("成功创建目录" + dire.getPath());
			}
		} else {// 存在该路径
			System.out.println("目录已存在！");
		}
	}
	//创建文件
	public static void createFile(String path){
		File file = new File(path);
		if (!file.exists()) {// 不存在该文件
			System.out.println("不存在该文件!");
			Boolean create;
			try {
				create = file.createNewFile();// 创建新文件，获取返回值
				if (create) {
					System.out.println("成功创建文件" + file.getPath());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {// 存在该文件
			System.out.println("文件已存在!");
		}
	}
	
	//为D:\myio\write.txt写入初始数据
	public static void firstWords(){
		String inWords = "abcdefghijklmnopqrstuvwxyz"+" ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+" 1234567890"+" 壹贰叁肆伍陆柒捌玖拾";
		try {
			writer = new FileWriter(fileOrigin);
			writer.write(inWords);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*以下三个读取方法*/
	//read1,单个字符读取
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
	//read2，字符数组读取
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
	//read3，字符数组读取，限定范围
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
	
	/*以下三个写入方法*/
	/*设置为write1清空文件并写入,write2、write3拼接到write1后,使每次运行后结果相同*/
	//write1,字符串写入,覆盖原有数据
	public static void write1(File file, String st){
		System.out.println("****************write1****************");
		try {
			writer = new FileWriter(file);
			writer.write(st);
			writer.flush();
			writer.close();
			System.out.println("写入成功!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//write2,字符数组写入,拼接原有数据
	public static void write2(File file, String st){
		System.out.println("****************write2****************");
		char ch[] = st.toCharArray();
		try {
			writer = new FileWriter(file,true);
			writer.write(ch);
			writer.flush();
			writer.close();
			System.out.println("写入成功!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//write3,指定的字符数组区间写入,拼接原有数据
	public static void write3(File file, String st){
		System.out.println("****************write3****************");
		char ch[] = st.toCharArray();
		try {
			writer = new FileWriter(file,true);
			//跳过前五个,输出st.length()-10个(去除后五个)
			writer.write(ch, 5, st.length()-10);
			writer.flush();
			writer.close();
			System.out.println("写入成功!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//main方法
	public static void main(String[] args) {
		//创建
		createDirectory("D:\\myio");
		createDirectory("D:\\myio\\write");
		createFile("D:\\myio\\write.txt");
		createFile("D:\\myio\\write\\write.txt");
		
		//读取
		firstWords();//初始化数据
		String st1 = read1(fileOrigin);
		
		firstWords();//初始化数据(文件已被读取，需重新赋值)
		String st2 = read2(fileOrigin);
		
		firstWords();//初始化数据(文件已被读取，需重新赋值)
		String st3 = read3(fileOrigin);
		
		//写入
		write1(fileTarget,st1);
		write2(fileTarget,"\r\n"+st2+"\r\n");//"\r\n"用于换行,方便区分不同输入方法结果
		write3(fileTarget,st3);
		
		System.out.println("感谢使用!");
	}
	
}
