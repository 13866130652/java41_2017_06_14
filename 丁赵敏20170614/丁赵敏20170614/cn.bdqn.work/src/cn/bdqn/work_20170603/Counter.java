/**
 * 
 */
package cn.bdqn.work_20170603;

import java.util.Scanner;

/**
 * @author Administrator ���������ַ��������ַ������ַ����ֵĴ���
 */
public class Counter {
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 *            ע��equals��==��������
	 */
	public static void main(String[] args) {
		int m = 0;
		System.out.println("�����������ַ�����");
		String str = sc.next();
		System.out.println("��������׼�����ҵ��ַ���");
		char ch = sc.next().charAt(0);
		str.toCharArray();
		// ��������
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
