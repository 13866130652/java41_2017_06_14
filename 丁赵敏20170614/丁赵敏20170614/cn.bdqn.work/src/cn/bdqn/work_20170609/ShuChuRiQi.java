/**
 * 
 */
package cn.bdqn.work_20170609;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator ���þ���������2017��6��3�գ�ʹ�ø�ʽ�������������ڣ�0000-00-00��
 */
public class ShuChuRiQi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");// �����ʽ
		cl.set(Calendar.YEAR, 2017);
		cl.set(Calendar.MONTH, 5);// ע������·ݴ�0��ʼ��
		cl.set(Calendar.DATE, 3);
		String st = format.format(cl.getTime());
		System.out.println(st);
	}

}
