/**
 * 
 */
package cn.bdqn.work_20170607;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Oppdelete {
	public static StringBuffer usingdelete(StringBuffer str1, int s, int e) {
		Scanner sc = new Scanner(System.in);
		return str1.delete(s, e);
	}

	public static void Oppdelete(String str, char a) {
		Scanner sc = new Scanner(System.in);
		char ch[] = str.toCharArray();
		System.out.println("��������Ҫɾ����Ԫ�أ�");
		a = sc.next().charAt(0);
		int index = 0;
		// ���������ҵ�Ԫ���±�
		for (int i = 0; i < ch.length; i++) {
			if (a == ch[i]) {
				index = i;// �ҵ��±�Ϳ���
				// System.out.println(index);
				break;
			}
		}
		// ���±꿪ʼ������ǰ�渲��
		for (int i = index; i < ch.length - 1; i++) {
			ch[i] = ch[i + 1];
			// System.out.println(ch[i]);
		}
		// ch[]������
		char[] ch1 = Arrays.copyOf(ch, ch.length - 1);
		String st = new String(ch1);
		System.out.println(st);

	}
}
