/**
 * 
 */
package cn.bdqn.work_20170606;

/**
 * @author Administrator ��ת�ַ���
 */
public class Turndown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "qwertyuio123";
		str.toCharArray();
		// toCharArray()�������������
		for (char c : str.toCharArray()) {
			System.out.println(c);
		}
		System.out.println("**********�������*********");
		// ������������
		for (int i = str.toCharArray().length - 1; i >= 0; i--) {
			System.out.print(str.toCharArray()[i]);
		}
	}

}
