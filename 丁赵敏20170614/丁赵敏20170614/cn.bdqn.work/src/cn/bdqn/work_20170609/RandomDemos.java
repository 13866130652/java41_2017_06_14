/**
 * 
 */
package cn.bdqn.work_20170609;

import java.util.Random;

/**
 * @author Administrator 生成四位随机码
 */
public class RandomDemos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int x = 0;
		for (int i = 0; i < 4; i++) {
			x = random.nextInt(10);
			System.out.print(x);
		}
	}

}
