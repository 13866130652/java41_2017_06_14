/**
 * 
 */
package cn.bdqn.work_20170602;

/**
 * @author Administrator
 *
 */
public class WeekTest {

	/**
	 * @param args
	 *            main方法
	 */
	public static void main(String[] args) {
		Hexin();
	}

	public static void Hexin() {
		// 以周一为例输出
		Week go = Week.MON;
		switch (go) {
		case MON: {
			System.out.println("今天是" + go.getWeek() + "要上班！");
			break;
		}
		case TUE: {
			System.out.println("今天是" + go.getWeek() + "要上班！");
			break;
		}
		case WED: {
			System.out.println("今天是" + go.getWeek() + "要上班！");
			break;
		}
		case THU: {
			System.out.println("今天是" + go.getWeek() + "要上班！");
			break;
		}
		case FRI: {
			System.out.println("今天是" + go.getWeek() + "要上班！");
			break;
		}
		case SAT: {
			System.out.println("今天是" + go.getWeek() + "可以休息！");
			break;
		}
		case SUN: {
			System.out.println("今天是" + go.getWeek() + "可以休息！");
			break;
		}
		default: {
			System.out.println("输入有误！");
		}
		}
	}
}
