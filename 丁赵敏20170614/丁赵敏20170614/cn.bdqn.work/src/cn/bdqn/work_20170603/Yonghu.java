/**
 * 
 */
package cn.bdqn.work_20170603;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Yonghu {
	static Scanner sc = new Scanner(System.in);
	public static String name, name1, mima, mima1, mima2;

	/**
	 * @param args
	 *            ʵ���û�ע���¼
	 */
	public static void main(String[] args) {
		zhuce();// ע��
		denglu();// ��½
	}

	public static void zhuce() {
		System.out.println("***************��ӭע��************");
		System.out.println("�����������û�����");
		name = sc.next();
		System.out.println("�����������û����룺");
		mima = sc.next();
		boolean flag = true;// ��ǽ���ѭ����������벻�������������룬�ڶ���ȷ��
		while (flag) {
			if (mima.length() >= 6) {
				System.out.println("��ȷ��������룺");
				mima1 = sc.next();
				if (mima.equals(mima1)) {
					System.out.println("��ϲ��ע��ɹ�!");
					flag = false;
				} else {
					System.out.println("�����������벻һ�£�");
				}
			} else {
				System.out.println("�������Ҫ����λ���ϣ�");
				System.out.println("���������������û����룺");
				mima = sc.next();
			}
		}
	}

	public static void denglu() {
		System.out.println("********************��ӭ�����ٻ�ʦϿ��****************");
		System.out.println("�����������û�����");
		name1 = sc.next();
		System.out.println("�����������û����룺");
		mima2 = sc.next();
		if (name.equals(name1) && mima.equals(mima2)) {
			System.out.println("��ӭ���ĵ�½��");
		} else {
			System.out.println("��������������û�����ƥ�䣡");
		}
	}
}
