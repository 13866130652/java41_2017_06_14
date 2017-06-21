/**
 * 
 */
package cn.bdqn.work_20170606;

/**
 * @author Administrator 反转字符串
 */
public class Turndown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "qwertyuio123";
		str.toCharArray();
		// toCharArray()方法后遍历数组
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
		System.out.println("**********逆序输出*********");
		// 逆向遍历并输出
		for (int i = str.toCharArray().length - 1; i >= 0; i--) {
			System.out.print(str.toCharArray()[i]);
		}
	}

}
