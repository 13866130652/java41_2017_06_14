/**
 * 
 */
package cn.bdqn.work_20170603;

import java.util.Scanner;

/**
 * @author Administrator �ж��ļ��Ƿ�Ϸ�
 */
public class FilesTrue {
	public static Scanner sc = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean fileCorrect = false;// ����ļ��Ƿ����
		boolean emailCorrect = false;// ���email�Ƿ���ȷ
		System.out.println("*************��ӭ������ҵ�ύϵͳ************");
		System.out.println("������java�ļ�����");
		String fileName = sc.next();
		System.out.println("������������䣺");
		String email = sc.next();
		int index = fileName.lastIndexOf(".");// "."��λ��
		if (index != -1 && index != 0 && fileName.substring(index + 1, fileName.length()).equals("java")) {
			fileCorrect = true;// ����ļ�����
		} else {
			System.out.println("��Ҫ���ҵ�Java�ļ������ڣ�");
		}
		// �����������Ƿ���ȷ
		if (email.indexOf('@') != -1 && email.indexOf('.') > email.indexOf('@')) {
			emailCorrect = true;
		} else {
			System.out.println("�������email����������ȷ�ϣ�");
		}
		if (fileCorrect && emailCorrect) {
			System.out.println("��ҵ�ύ�ɹ���");
		} else {
			System.out.println("��ҵ�ύʧ�ܣ�");
		}
	}
}
