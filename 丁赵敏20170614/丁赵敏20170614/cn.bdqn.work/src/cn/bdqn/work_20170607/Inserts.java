/**
 * 
 */
package cn.bdqn.work_20170607;

import java.util.Scanner;

/**
 * @author Administrator 插入方法进行封装
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
		System.out.print("输入字符串:");
		String st = sc.next();

		char[] ch = new char[st.length() + 1];
		st.getChars(0, st.length(), ch, 0);
		for (char c : ch) {
			System.out.println(c);
		}
		// 遍历数组找到元素是‘9’的下标
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
		ch[index] = ',';// ','替换掉‘9’后面每一个元素后移一位
		String s = new String(ch);
		System.out.println(s);
	}

	@Override
	public String toString() {
		return "Inserts [Intsert=" + Intsert + "]";
	}
}
