/**
 * 
 */
package cn.bdqn.work_20170607;

/**
 * @author Administrator
 *
 */
public class ReverseSort {

	/**
	 * @param args
	 *            ����reverse������ת����ð�ݷ�������
	 */
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("12343212x356");
		System.out.println("************str.reverse()**************");
		System.out.println(str.reverse());
		System.out.println("************str.toString()**************");
		System.out.println(str.toString());
		System.out.println("************str.toString().toCharArray()**************");
		System.out.println(str.toString().toCharArray());
		System.out.println("************��������**************");
		for (char s : str.toString().toCharArray()) {
			System.out.println(s);
		}
		char ch[] = str.toString().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - i - 1; j++) {
				if (ch[j] > ch[j + 1]) {// ��С�������
					char x = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = x;
				}
			}
		}
		System.out.println("************ð�����к��������**************");
		System.out.println(ch);
	}

}
