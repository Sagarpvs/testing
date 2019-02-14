package practice;

public class Cast {

	public static void main(String[] args) {
		byte b = 10;
		b = (byte) (b * 2);
		short s = b;
		s = (short) (s * 3);
		int i = (int) s;
		i = i * 1;
		long l = i;
		l = l * 4;
		float f = l;
		f = f * 10;
		double d = f;
		d = d * 1;
		System.out.println("byte value  " + b);
		System.out.println("short value  " + s);
		System.out.println("int value  " + i);
		System.out.println("long value  " + l);
		System.out.println("float value  " + f);
		System.out.println("double value  " + d);
	}

}
