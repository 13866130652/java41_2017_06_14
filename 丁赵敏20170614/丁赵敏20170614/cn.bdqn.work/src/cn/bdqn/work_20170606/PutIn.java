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
	 *            ��ָ��λ�ò����ַ�����µ��ַ���
	 */
	public static String[] split(String v, String obj, int limit) {
		String st[] = v.split(obj, limit);// limit:�гɼ���
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str = sc.next();
		System.out.println("��������Ҫ������ַ���");
		char ch = sc.next().charAt(0);
		System.out.println("��������Ҫ�����λ�ã�");
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
