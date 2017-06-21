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
		System.out.println("请输入你要删除的元素：");
		a = sc.next().charAt(0);
		int index = 0;
		// 遍历数组找到元素下标
		for (int i = 0; i < ch.length; i++) {
			if (a == ch[i]) {
				index = i;// 找到下标就可以
				// System.out.println(index);
				break;
			}
		}
		// 从下标开始后面向前面覆盖
		for (int i = index; i < ch.length - 1; i++) {
			ch[i] = ch[i + 1];
			// System.out.println(ch[i]);
		}
		// ch[]新数组
		char[] ch1 = Arrays.copyOf(ch, ch.length - 1);
		String st = new String(ch1);
		System.out.println(st);

	}
}
