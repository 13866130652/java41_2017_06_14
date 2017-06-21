package cn.work;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨
//ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���
//���е��ļ���Ŀ¼Ҫ��ʹ��File�����д���

public class Zuoye1 {
	//Ŀ���ļ�
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
	//����1
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
	//����2
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
	//����3
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
