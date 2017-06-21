package cn.work;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台
//使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中
//所有的文件、目录要求使用File语句进行创建

public class Zuoye1 {
	//目标文件
	private static File file=new File("D:\\myio\\write.txt");
	private static File file1=new File("D:\\myio\\write\\write.txt");
	static Writer wt=null;
	static Reader rd=null;
	static{
		try {
		 wt=new FileWriter(file,true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//方法1
	public static void show1(){
		try{
			rd=new FileReader(file);
			wt=new FileWriter(file1);
			char ch[]=new char[1024];
			int length=0;
			while((length=rd.read(ch,0,ch.length))!=-1){
				for(int i=0;i<length;i++){
					System.out.print(ch[i]);
					wt.write(ch[i]);
					wt.flush();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//方法2
	public static void show2(){
		try {
			rd=new FileReader(file);
			wt=new FileWriter(file1);
			char ch[]=new char[1024];
			int length=0;		
			while((length=rd.read(ch))!=-1){ 
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
	//方法3
	public static void show3(){
		try {
			rd=new FileReader(file);
			wt=new FileWriter(file1);
			int data=0;
			while((data=rd.read())!=-1){
				System.out.print((char) data);
				wt.write((char) data);
				wt.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(){
		try{
			if(wt !=null){
				wt.close();
			}
			if(rd !=null){
				rd.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		show1();
		//show2();
		//show3();

	}

}
