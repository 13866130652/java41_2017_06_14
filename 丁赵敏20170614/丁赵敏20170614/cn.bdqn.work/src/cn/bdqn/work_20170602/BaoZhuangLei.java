/**
 * 
 */
package cn.bdqn.work_20170602;

/**
 * @author Administrator main����ʹ��TPYE�������8�ְ�װ��Ķ�Ӧ�������� ������ֵ��Сֵ Boolean����
 *
 */
public class BaoZhuangLei {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ʹ��TPYE�������8�ְ�װ��Ķ�Ӧ��������
		System.out.println(Byte.TYPE);
		System.out.println(Boolean.TYPE);
		System.out.println(Short.TYPE);
		System.out.println(Character.TYPE);
		System.out.println(Integer.TYPE);
		System.out.println(Long.TYPE);
		System.out.println(Float.TYPE);
		System.out.println(Double.TYPE);
		System.out.println("************byte��ֵ************");
		Byte b = new Byte((byte) 1);
		Byte b1 = new Byte("1");
		String a4 = "1234";
		Byte n4 = (byte) Integer.parseInt(a4);
		Byte x4 = (byte) (n4 / 1000);
		Byte y4 = (byte) (n4 / 100 % 10);
		Byte z4 = (byte) (n4 / 10 % 10);
		Byte v4 = (byte) (n4 % 10);
		System.out.println("��λ֮����" + (x4 + y4 + z4 + v4));
		System.out.println("���ֵ" + "=" + b.MAX_VALUE);
		System.out.println("��Сֵ" + "=" + b.MIN_VALUE);
		System.out.println("************Boolean��ֵ(��)************");
		Boolean B = new Boolean(true);
		System.out.println(B.compareTo(B));
		System.out.println(B.booleanValue());
		System.out.println("************short��ֵ************");
		Short s = new Short((short) 1);
		Short s1 = new Short("1");
		String a5 = "1234";
		int n5 = Integer.parseInt(a5);
		int x5 = n5 / 1000;
		int y5 = n5 / 100 % 10;
		int z5 = n5 / 10 % 10;
		int v5 = n5 % 10;
		System.out.println("��λ֮����" + (x5 + y5 + z5 + v5));
		System.out.println("���ֵ" + "=" + s.MAX_VALUE);
		System.out.println("��Сֵ" + "=" + s.MIN_VALUE);
		System.out.println("************Character��ֵ(��)************");
		Character c = new Character('1');
		System.out.println("************Integer��ֵ************");
		Integer i = new Integer(1);
		Integer i1 = new Integer("1");
		String a = "1234";
		int n = Integer.parseInt(a);
		int x = n / 1000;
		int y = n / 100 % 10;
		int z = n / 10 % 10;
		int v = n % 10;
		System.out.println("��λ֮����" + (x + y + z + v));
		System.out.println("���ֵ" + "=" + i.MAX_VALUE);
		System.out.println("��Сֵ" + "=" + i.MIN_VALUE);
		System.out.println("************Long��ֵ************");
		Long l = new Long(1);
		Long l1 = new Long("1");

		String a3 = "1234";
		Long n3 = (long) Float.parseFloat(a3);
		Long x3 = n3 / 1000;
		Long y3 = n3 / 100 % 10;
		Long z3 = n3 / 10 % 10;
		Long v3 = n3 % 10;
		System.out.println("��λ֮����" + (x3 + y3 + z3 + v3));
		System.out.println("���ֵ" + "=" + l.MAX_VALUE);
		System.out.println("��Сֵ" + "=" + l.MIN_VALUE);
		System.out.println("************Float��ֵ************");
		Float f = new Float(1);
		Float f1 = new Float("1");
		String a2 = "1234";
		Float n2 = Float.parseFloat(a2);
		Float x2 = n2 / 1000;
		Float y2 = n2 / 100 % 10;
		Float z2 = n2 / 10 % 10;
		Float v2 = n2 % 10;
		System.out.println("��λ֮����" + (x2 + y2 + z2 + v2));
		System.out.println("���ֵ" + "=" + f.MAX_VALUE);
		System.out.println("��Сֵ" + "=" + f.MIN_VALUE);
		System.out.println("************Double��ֵ************");
		Double d = new Double(1);
		Double d1 = new Double("1");
		String a1 = "1234";
		double n1 = Double.parseDouble(a1);
		double x1 = n1 / 1000;
		double y1 = n1 / 100 % 10;
		double z1 = n1 / 10 % 10;
		double v1 = n1 % 10;
		System.out.println("��λ֮����" + (x1 + y1 + z1 + v1));
		System.out.println("���ֵ" + "=" + d.MAX_VALUE);
		System.out.println("��Сֵ" + "=" + d.MIN_VALUE);
	}

}
