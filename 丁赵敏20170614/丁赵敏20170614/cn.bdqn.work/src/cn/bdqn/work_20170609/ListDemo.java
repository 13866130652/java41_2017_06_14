/**
 * 
 */
package cn.bdqn.work_20170609;
//1) ����һ��List����List �������������ˣ�������Ϣ���£�

//���� ���� ����
//zhang3 18 3000
//li4 25 3500
//wang5 22 3200
//2) ��li4 ֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300
//3) ɾ��wang5 ����Ϣ
//4) ����for ѭ����������ӡList �����й��˵���Ϣ
//5) ���õ�����������List �����еĹ��˵���work ������
//6) ΪWorker ����дequals �����������������䡢����ȫ�����ʱ��ŷ���true

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	// 1.�������϶���
	public static List list = new ArrayList();// Ĭ�ϼ��ϳ�����10

	// forѭ����������
	public static void bianli() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	// ��������
	public static void Iterators() {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			// 5.�ҵ���һ��Ԫ��
			Object o = it.next();
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		Worker ww = new Worker("����", 18, 3000);
		Worker ww1 = new Worker("����", 25, 3500);
		Worker ww2 = new Worker("����", 22, 3200);
		Worker ww3 = new Worker("����", 24, 3300);
		Worker ww4 = new Worker("����", 24, 3300);
		list.add(ww);
		list.add(ww1);
		list.add(ww2);
		list.add(1, ww3);
		list.remove(3);
		System.out.println("********����for����**********");
		bianli();
		System.out.println("********���ǵ���������**********");
		Iterators();
		System.out.println("**********equals�Ƚ�**********8");
		System.out.println(ww3.equals(ww4));
	}
}
