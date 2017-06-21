/**
 * 
 */
package cn.bdqn.work_20170603;

/**
 * @author Administrator A-z，0-9取四位存成字符串
 */
public class SiWei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		str.toCharArray();
		int i = 0, x = 0;
		// 遍历数组
		for (i = 0; i < str.toCharArray().length; i++) {
			System.out.println(str.toCharArray()[i]);
		}
		System.out.println("******************************");
		// 随机得到四个元素并输出
		for (int a = 0; a < 4; a++) {
			x = (int) (Math.random() * 63);
			i = x;
			char stri = str.toCharArray()[i];
			System.out.print(stri);
		}

	}

}
