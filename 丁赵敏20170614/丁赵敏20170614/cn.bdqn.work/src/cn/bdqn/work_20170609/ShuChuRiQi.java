/**
 * 
 */
package cn.bdqn.work_20170609;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator 设置具体日期是2017年6月3日，使用格式化输出具体的日期（0000-00-00）
 */
public class ShuChuRiQi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");// 输出格式
		cl.set(Calendar.YEAR, 2017);
		cl.set(Calendar.MONTH, 5);// 注意外国月份从0开始记
		cl.set(Calendar.DATE, 3);
		String st = format.format(cl.getTime());
		System.out.println(st);
	}

}
