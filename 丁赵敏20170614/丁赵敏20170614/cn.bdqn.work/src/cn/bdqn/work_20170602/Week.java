/**
 * 
 */
package cn.bdqn.work_20170602;

/**
 * @author Administrator ����һ���������ϰ���������������Ϣ
 */
public enum Week {
	MON("����һ"), TUE("���ڶ�"), WED("������"), THU("������"), FRI("������"), SAT("������"), SUN("������");
	private String week;

	private Week(String week) {
		this.week = week;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

}
