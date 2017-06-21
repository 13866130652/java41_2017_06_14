package wdw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class WriterDemo {
	public static File file=new File("D:\\myio1\\write\\write.txt");
	static Writer writ=null;
	static{
		try {
			writ=new FileWriter(file,true);
		} catch (Exception e) {
		}
		
	}
	
//创建目录
	public static void Mulu(String path){
		File f = new File(path);
		if (!f.exists()){
			if (f.mkdir()) {
				System.out.println("创建目录"+path+"成功");
			}
		}else {
			System.out.println("目标路径"+path+"已存在");
		}
	}
	//创建文件
	public static void Wenjian(String path){
		File f=new File(path);
		if (!f.exists()) {
			try {
				if (f.createNewFile()) {
					System.out.println("创建文件成功");
				}
			} catch (Exception e) {
			}
			}else {
				System.out.println("已存在");
			}
		}
	public static void close(){
		try {
			if (writ!=null) {
				writ.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void Write1(){
		try {
			
			String st="咋这么无聊";
			writ.write(st);
			writ.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Write2(){
		String st="无聊的人生";
		char[]ch=st.toCharArray();
		try {
			//3把字符串写到文件中
			writ.write(ch);
			writ.flush();//清除缓存
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void write3() {
		String st = "无聊无聊无聊，。3。。。";
		char ch[] = st.toCharArray();
		try {
			Writer wt = new FileWriter(file);
			wt.write(ch, 5, st.length() - 1);
			wt.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
     Mulu("D:\\myio1\\write");
     Wenjian("D:\\myio1\\write\\write.txt");
     Write1();
     //Write2();
     //write3();
     close();
	}

}
