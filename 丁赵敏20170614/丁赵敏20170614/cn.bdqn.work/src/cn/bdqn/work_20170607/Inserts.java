/**
 * 
 */
package cn.bdqn.work_20170607;

import java.util.Scanner;

/**
 * @author Administrator ���뷽�����з�װ
 */
public class Inserts {
	private String Intsert;

	public Inserts() {

	}

	public Inserts(String intsert) {
		super();
		Intsert = intsert;
	}

	public String getIntsert() {
		return Intsert;
	}

	public void setIntsert(String intsert) {

		Intsert = intsert;
	}

	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ַ���:");
		String st = sc.next();

		char[] ch = new char[st.length() + 1];
		st.getChars(0, st.length(), ch, 0);
		for (char c : ch) {
			System.out.println(c);
		}
		// ���������ҵ�Ԫ���ǡ�9�����±�
		int index = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '9') {
				index = i;
				break;
			}
		}
		for (int i = ch.length - 1; i > index; i--) {
			ch[i] = ch[i - 1];
		}
		ch[index] = ',';// ','�滻����9������ÿһ��Ԫ�غ���һλ
		String s = new String(ch);
		System.out.println(s);
	}

	@Override
	public String toString() {
		return "Inserts [Intsert=" + Intsert + "]";
	}
}
