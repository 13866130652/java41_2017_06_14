/**
 * 
 */
package cn.bdqn.work_20170603;

import java.util.Scanner;

/**
 * @author Administrator 输入您的字符串查找字符串中字符出现的次数
 */
public class Counter {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 *            注意equals和==的适用性
	 */
	public static void main(String[] args) {
		int m = 0;
		System.out.println("请输入您的字符串：");
		String str = sc.next();
		System.out.println("请输入您准备查找的字符：");
		char ch = sc.next().charAt(0);
		str.toCharArray();
		// 遍历数组
		for (int i = 0; i < str.toCharArray().length; i++) {
			System.out.println(str.toCharArray()[i]);
		}
		for (int i = 0; i < str.toCharArray().length; i++) {
			if (ch == (str.toCharArray()[i])) {
				m++;
			}
		}
		System.out.println(m);
	}

}
