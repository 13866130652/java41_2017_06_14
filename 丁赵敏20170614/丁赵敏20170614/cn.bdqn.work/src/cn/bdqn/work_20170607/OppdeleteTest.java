/**
 * 
 */
package cn.bdqn.work_20170607;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class OppdeleteTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Oppdelete op = new Oppdelete();
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�������ַ�����");
		String str = sc.next();
		StringBuffer str1 = new StringBuffer(str);
		System.out.println("������Ҫɾ�����±���ʼλ�ã�");
		int s = sc.nextInt();
		System.out.println("������Ҫɾ�����±�ĩβλ�ã�");
		int e = sc.nextInt();
		System.out.println(op.usingdelete(str1, s, e));
		op.Oppdelete(str, ' ');

	}

}
