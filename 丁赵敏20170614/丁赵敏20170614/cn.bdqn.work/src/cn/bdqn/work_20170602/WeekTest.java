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
	 *            main����
	 */
	public static void main(String[] args) {
		Hexin();
	}

	public static void Hexin() {
		// ����һΪ�����
		Week go = Week.MON;
		switch (go) {
		case MON: {
			System.out.println("������" + go.getWeek() + "Ҫ�ϰ࣡");
			break;
		}
		case TUE: {
			System.out.println("������" + go.getWeek() + "Ҫ�ϰ࣡");
			break;
		}
		case WED: {
			System.out.println("������" + go.getWeek() + "Ҫ�ϰ࣡");
			break;
		}
		case THU: {
			System.out.println("������" + go.getWeek() + "Ҫ�ϰ࣡");
			break;
		}
		case FRI: {
			System.out.println("������" + go.getWeek() + "Ҫ�ϰ࣡");
			break;
		}
		case SAT: {
			System.out.println("������" + go.getWeek() + "������Ϣ��");
			break;
		}
		case SUN: {
			System.out.println("������" + go.getWeek() + "������Ϣ��");
			break;
		}
		default: {
			System.out.println("��������");
		}
		}
	}
}
