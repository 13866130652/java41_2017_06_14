package ke_20170610;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class IO {

	public static void main(String[] args) {
		InputStream is = null;
		try {// 创建输入流对象
			File originFile = new File("E:\\待处理目录\\file.txt");
			is = new FileInputStream(originFile);
			// 读取文件到控制台
			int data = 0;
			while ((data = is.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭输入流
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
