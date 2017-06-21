/**
 * 
 */
package cn.bdqn.work_20170602;

/**
 * @author Administrator 星期一至星期五上班星期六星期日休息
 */
public enum Week {
	MON("星期一"), TUE("星期二"), WED("星期三"), THU("星期四"), FRI("星期五"), SAT("星期六"), SUN("星期日");
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
