/**
 * 
 */
package cn.bdqn.work_20170609;

/**
 * @author Administrator 世界杯
 */
public class WorldCup {
	private String country;// 国家
	private String years;// 夺冠年份
	// 有参无参构造

	public WorldCup() {

	}

	public WorldCup(String country, String years) {
		super();
		this.country = country;
		this.years = years;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "WorldCup [country=" + country + ", years=" + years + "]";
	}

}
