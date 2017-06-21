/**
 * 
 */
package cn.bdqn.work_20170606;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class PutIn {

	/**
	 * @param args
	 *            在指定位置插入字符组成新的字符串
	 */
	public static String[] split(String v, String obj, int limit) {
		String st[] = v.split(obj, limit);// limit:切成几块
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.next();
		System.out.println("请输入你要插入的字符：");
		char ch = sc.next().charAt(0);
		System.out.println("请输入你要插入的位置：");
		int a = sc.nextInt();
		// str.toCharArray();
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == a) {
				str1 += ch + str.toCharArray()[i];
			} else {
				str1 += str.toCharArray()[i];
			}
		}
		System.out.println(str1);
		// char[] b = str.toCharArray();
		// for (char s : str.toCharArray()) {
		// System.out.println(s);
		// }
		// for (int i = 0; i < str.toCharArray().length + 1; i++) {
		// if (a == i) {
		// b[i] = ch;
		// b[i] = b[i + 1];
		// }
		// System.out.println(b[i]);
		//
		// }

	}

}
