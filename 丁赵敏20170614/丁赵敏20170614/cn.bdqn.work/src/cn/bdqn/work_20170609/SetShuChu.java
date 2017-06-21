/**
 * 
 */
package cn.bdqn.work_20170609;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Administrator
 *
 */
public class SetShuChu {

	/**
	 * @param args
	 *            set输出 A． 编译不通过 B． 编译通过，运行时异常 C． 编译运行都正常，输出3 D． 编译运行都正常，输出4
	 */
	public static void main(String[] args) {
		Set ss = new TreeSet();
		ss.add("A． 编译不通过");
		ss.add("B． 编译通过，运行时异常");
		ss.add("C． 编译运行都正常，输出3");
		ss.add("D． 编译运行都正常，输出4");
		// 迭代器输出存入信息
		Iterator<String> it = ss.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

	}

}
