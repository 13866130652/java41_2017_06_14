/**
 * 
 */
package cn.bdqn.work_20170603;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Yonghu {
	static Scanner sc = new Scanner(System.in);
	public static String name, name1, mima, mima1, mima2;

	/**
	 * @param args
	 *            实现用户注册登录
	 */
	public static void main(String[] args) {
		zhuce();// 注册
		denglu();// 登陆
	}

	public static void zhuce() {
		System.out.println("***************欢迎注册************");
		System.out.println("请输入您的用户名：");
		name = sc.next();
		System.out.println("请输入您的用户密码：");
		mima = sc.next();
		boolean flag = true;// 标记进入循环，如果密码不符合则重新输入，第二次确认
		while (flag) {
			if (mima.length() >= 6) {
				System.out.println("请确认你的密码：");
				mima1 = sc.next();
				if (mima.equals(mima1)) {
					System.out.println("恭喜你注册成功!");
					flag = false;
				} else {
					System.out.println("两次密码输入不一致！");
				}
			} else {
				System.out.println("密码必须要是六位以上！");
				System.out.println("请重新输入您的用户密码：");
				mima = sc.next();
			}
		}
	}

	public static void denglu() {
		System.out.println("********************欢迎来到召唤师峡谷****************");
		System.out.println("请输入您的用户名：");
		name1 = sc.next();
		System.out.println("请输入您的用户密码：");
		mima2 = sc.next();
		if (name.equals(name1) && mima.equals(mima2)) {
			System.out.println("欢迎您的登陆！");
		} else {
			System.out.println("您的输入密码和用户名不匹配！");
		}
	}
}
