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
	 *            set��� A�� ���벻ͨ�� B�� ����ͨ��������ʱ�쳣 C�� �������ж����������3 D�� �������ж����������4
	 */
	public static void main(String[] args) {
		Set ss = new TreeSet();
		ss.add("A�� ���벻ͨ��");
		ss.add("B�� ����ͨ��������ʱ�쳣");
		ss.add("C�� �������ж����������3");
		ss.add("D�� �������ж����������4");
		// ���������������Ϣ
		Iterator<String> it = ss.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

	}

}
