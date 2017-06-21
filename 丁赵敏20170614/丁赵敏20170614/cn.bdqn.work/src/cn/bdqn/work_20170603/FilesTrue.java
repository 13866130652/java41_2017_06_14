/**
 * 
 */
package cn.bdqn.work_20170603;

import java.util.Scanner;

/**
 * @author Administrator 判断文件是否合法
 */
public class FilesTrue {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean fileCorrect = false;// 标记文件是否存在
		boolean emailCorrect = false;// 标记email是否正确
		System.out.println("*************欢迎进入作业提交系统************");
		System.out.println("请输入java文件名：");
		String fileName = sc.next();
		System.out.println("请输入你的邮箱：");
		String email = sc.next();
		int index = fileName.lastIndexOf(".");// "."的位置
		if (index != -1 && index != 0 && fileName.substring(index + 1, fileName.length()).equals("java")) {
			fileCorrect = true;// 标记文件存在
		} else {
			System.out.println("您要查找的Java文件不存在！");
		}
		// 检查电子邮箱是否正确
		if (email.indexOf('@') != -1 && email.indexOf('.') > email.indexOf('@')) {
			emailCorrect = true;
		} else {
			System.out.println("您输入的email有误请重新确认！");
		}
		if (fileCorrect && emailCorrect) {
			System.out.println("作业提交成功！");
		} else {
			System.out.println("作业提交失败！");
		}
	}
}
