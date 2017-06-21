/**
 * 
 */
package cn.bdqn.work_20170609;
//1) 创建一个List，在List 中增加三个工人，基本信息如下：

//姓名 年龄 工资
//zhang3 18 3000
//li4 25 3500
//wang5 22 3200
//2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
//3) 删除wang5 的信息
//4) 利用for 循环遍历，打印List 中所有工人的信息
//5) 利用迭代遍历，对List 中所有的工人调用work 方法。
//6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	// 1.创建集合对象
	public static List list = new ArrayList();// 默认集合长度是10

	// for循环遍历数组
	public static void bianli() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	// 迭代遍历
	public static void Iterators() {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			// 5.找到下一个元素
			Object o = it.next();
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		Worker ww = new Worker("张三", 18, 3000);
		Worker ww1 = new Worker("李四", 25, 3500);
		Worker ww2 = new Worker("王五", 22, 3200);
		Worker ww3 = new Worker("赵六", 24, 3300);
		Worker ww4 = new Worker("赵六", 24, 3300);
		list.add(ww);
		list.add(ww1);
		list.add(ww2);
		list.add(1, ww3);
		list.remove(3);
		System.out.println("********这是for遍历**********");
		bianli();
		System.out.println("********这是迭代器遍历**********");
		Iterators();
		System.out.println("**********equals比较**********8");
		System.out.println(ww3.equals(ww4));
	}
}
