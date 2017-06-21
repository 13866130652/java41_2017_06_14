/**
 * 
 */
package cn.bdqn.work_20170609;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class WorldCups {
	/**
	 * @param args
	 */
	// 1.创建集合对象
	public static List list = new ArrayList();// 默认集合长度是10

	// for循环遍历数组
	public static void bianli() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		WorldCup w = new WorldCup("阿根廷", "1978 1986");
		WorldCup w1 = new WorldCup("乌拉圭", "1930 1950");
		WorldCup w2 = new WorldCup("意大利", "1934 1938 1982 2006");
		WorldCup w3 = new WorldCup("德国", "1954 1974 1990");
		WorldCup w4 = new WorldCup("巴西", "1958 1962 1970 1994 2002");
		WorldCup w5 = new WorldCup("英国", "1966");
		WorldCup w6 = new WorldCup("法国", "1998");
		WorldCup w7 = new WorldCup("荷兰", "没有获得过世界杯");
		list.add(w);
		list.add(w1);
		list.add(w2);
		list.add(w3);
		list.add(w4);
		list.add(w5);
		list.add(w6);
		list.add(w7);
		list.add("再接再厉明年可能表上就有其他国家！");
		boolean flag = false;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要查询的国家下标：");
			System.out.println("0.阿根廷\t1.乌拉圭\t2.意大利\t3.德国\t4.巴西\t5.英国\t6.法国\t7.荷兰8.其他国家");
			int choose = sc.nextInt();
			while (choose < 0 || choose > 8) {
				System.out.println("您输入的有误！");
				System.out.println("请重新输入你要查询的国家下标：");
				choose = sc.nextInt();
			}
			System.out.println(list.get(choose));
			flag = false;
		} while (flag);
	}
}
