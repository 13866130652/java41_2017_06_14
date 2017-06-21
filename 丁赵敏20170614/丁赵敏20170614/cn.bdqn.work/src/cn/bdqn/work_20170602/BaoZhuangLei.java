/**
 * 
 */
package cn.bdqn.work_20170602;

/**
 * @author Administrator main方法使用TPYE属性输出8种包装类的对应基本类型 输出最大值最小值 Boolean案例
 *
 */
public class BaoZhuangLei {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 使用TPYE属性输出8种包装类的对应基本类型
		System.out.println(Byte.TYPE);
		System.out.println(Boolean.TYPE);
		System.out.println(Short.TYPE);
		System.out.println(Character.TYPE);
		System.out.println(Integer.TYPE);
		System.out.println(Long.TYPE);
		System.out.println(Float.TYPE);
		System.out.println(Double.TYPE);
		System.out.println("************byte最值************");
		Byte b = new Byte((byte) 1);
		Byte b1 = new Byte("1");
		String a4 = "1234";
		Byte n4 = (byte) Integer.parseInt(a4);
		Byte x4 = (byte) (n4 / 1000);
		Byte y4 = (byte) (n4 / 100 % 10);
		Byte z4 = (byte) (n4 / 10 % 10);
		Byte v4 = (byte) (n4 % 10);
		System.out.println("各位之和是" + (x4 + y4 + z4 + v4));
		System.out.println("最大值" + "=" + b.MAX_VALUE);
		System.out.println("最小值" + "=" + b.MIN_VALUE);
		System.out.println("************Boolean最值(无)************");
		Boolean B = new Boolean(true);
		System.out.println(B.compareTo(B));
		System.out.println(B.booleanValue());
		System.out.println("************short最值************");
		Short s = new Short((short) 1);
		Short s1 = new Short("1");
		String a5 = "1234";
		int n5 = Integer.parseInt(a5);
		int x5 = n5 / 1000;
		int y5 = n5 / 100 % 10;
		int z5 = n5 / 10 % 10;
		int v5 = n5 % 10;
		System.out.println("各位之和是" + (x5 + y5 + z5 + v5));
		System.out.println("最大值" + "=" + s.MAX_VALUE);
		System.out.println("最小值" + "=" + s.MIN_VALUE);
		System.out.println("************Character最值(无)************");
		Character c = new Character('1');
		System.out.println("************Integer最值************");
		Integer i = new Integer(1);
		Integer i1 = new Integer("1");
		String a = "1234";
		int n = Integer.parseInt(a);
		int x = n / 1000;
		int y = n / 100 % 10;
		int z = n / 10 % 10;
		int v = n % 10;
		System.out.println("各位之和是" + (x + y + z + v));
		System.out.println("最大值" + "=" + i.MAX_VALUE);
		System.out.println("最小值" + "=" + i.MIN_VALUE);
		System.out.println("************Long最值************");
		Long l = new Long(1);
		Long l1 = new Long("1");

		String a3 = "1234";
		Long n3 = (long) Float.parseFloat(a3);
		Long x3 = n3 / 1000;
		Long y3 = n3 / 100 % 10;
		Long z3 = n3 / 10 % 10;
		Long v3 = n3 % 10;
		System.out.println("各位之和是" + (x3 + y3 + z3 + v3));
		System.out.println("最大值" + "=" + l.MAX_VALUE);
		System.out.println("最小值" + "=" + l.MIN_VALUE);
		System.out.println("************Float最值************");
		Float f = new Float(1);
		Float f1 = new Float("1");
		String a2 = "1234";
		Float n2 = Float.parseFloat(a2);
		Float x2 = n2 / 1000;
		Float y2 = n2 / 100 % 10;
		Float z2 = n2 / 10 % 10;
		Float v2 = n2 % 10;
		System.out.println("各位之和是" + (x2 + y2 + z2 + v2));
		System.out.println("最大值" + "=" + f.MAX_VALUE);
		System.out.println("最小值" + "=" + f.MIN_VALUE);
		System.out.println("************Double最值************");
		Double d = new Double(1);
		Double d1 = new Double("1");
		String a1 = "1234";
		double n1 = Double.parseDouble(a1);
		double x1 = n1 / 1000;
		double y1 = n1 / 100 % 10;
		double z1 = n1 / 10 % 10;
		double v1 = n1 % 10;
		System.out.println("各位之和是" + (x1 + y1 + z1 + v1));
		System.out.println("最大值" + "=" + d.MAX_VALUE);
		System.out.println("最小值" + "=" + d.MIN_VALUE);
	}

}
