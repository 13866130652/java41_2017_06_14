/**
 * 
 */
package cn.bdqn.work_20170609;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class WorldCups {
	/**
	 * @param args
	 */
	// 1.�������϶���
	public static List list = new ArrayList();// Ĭ�ϼ��ϳ�����10

	// forѭ����������
	public static void bianli() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		WorldCup w = new WorldCup("����͢", "1978 1986");
		WorldCup w1 = new WorldCup("������", "1930 1950");
		WorldCup w2 = new WorldCup("�����", "1934 1938 1982 2006");
		WorldCup w3 = new WorldCup("�¹�", "1954 1974 1990");
		WorldCup w4 = new WorldCup("����", "1958 1962 1970 1994 2002");
		WorldCup w5 = new WorldCup("Ӣ��", "1966");
		WorldCup w6 = new WorldCup("����", "1998");
		WorldCup w7 = new WorldCup("����", "û�л�ù����籭");
		list.add(w);
		list.add(w1);
		list.add(w2);
		list.add(w3);
		list.add(w4);
		list.add(w5);
		list.add(w6);
		list.add(w7);
		list.add("�ٽ�����������ܱ��Ͼ����������ң�");
		boolean flag = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ��ѯ�Ĺ����±꣺");
			System.out.println("0.����͢\t1.������\t2.�����\t3.�¹�\t4.����\t5.Ӣ��\t6.����\t7.����8.��������");
			int choose = sc.nextInt();
			while (choose < 0 || choose > 8) {
				System.out.println("�����������");
				System.out.println("������������Ҫ��ѯ�Ĺ����±꣺");
				choose = sc.nextInt();
			}
			System.out.println(list.get(choose));
			flag = false;
		} while (flag);
	}
}
