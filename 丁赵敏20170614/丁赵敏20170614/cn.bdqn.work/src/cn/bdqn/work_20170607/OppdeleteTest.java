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
		System.out.println("请输入要操作的字符串：");
		String str = sc.next();
		StringBuffer str1 = new StringBuffer(str);
		System.out.println("请输入要删除的下标起始位置：");
		int s = sc.nextInt();
		System.out.println("请输入要删除的下标末尾位置：");
		int e = sc.nextInt();
		System.out.println(op.usingdelete(str1, s, e));
		op.Oppdelete(str, ' ');

	}

}
