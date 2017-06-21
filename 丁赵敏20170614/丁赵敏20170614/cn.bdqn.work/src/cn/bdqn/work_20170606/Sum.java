/**
 * 
 */
package cn.bdqn.work_20170606;

/**
 * @author Administrator 统计字符出现字数排除首尾空格
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = " aB232 23 &*( s2 ";
		System.out.println(str);
		System.out.println("*******str.trim()********");
		System.out.println(str.trim());
		str.trim().toCharArray();
		int sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = 0; i < str.trim().toCharArray().length; i++) {
			if (str.trim().toCharArray()[i] >= 'A' && str.trim().toCharArray()[i] <= 'Z'
					|| (str.trim().toCharArray()[i] >= 'a' && str.trim().toCharArray()[i] <= 'z')) {
				sum1++;
			} else if (str.trim().toCharArray()[i] == ' ') {
				sum2++;
			} else if (str.trim().toCharArray()[i] >= 0 && str.trim().toCharArray()[i] <= 9
					|| (str.trim().toCharArray()[i] >= '0' && str.trim().toCharArray()[i] <= '9')) {
				sum3++;
			}
		}
		System.out.println("字母的数量是：" + sum1);
		System.out.println("空格的数量是：" + sum2);
		System.out.println("数字的数量是：" + sum3);
		System.out.println("其他字符的数量是：" + ((str.trim().toCharArray().length) - sum1 - sum2 - sum3));

	}

}
