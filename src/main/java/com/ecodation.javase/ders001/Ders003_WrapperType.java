package com.ecodation.javase.ders001;

public class Ders003_WrapperType {
	public static void main(String[] args) {
		// wrapper türler: gelişmiş türlerdir.
		// heap hafızada saklar
		// wrapper null verebiliriz.
		// objedir
		// new yazmak zorundayız
		// serileşitrme yapabiliriz.

		// tamsayılar
		Byte b1 = new Byte((byte) 127);
		System.out.println(b1);

		Short s1 = new Short((short) 4521);
		System.out.println(s1);

		Integer i1 = new Integer(4521);
		System.out.println(i1);

		Long l1 = new Long(4521);
		System.out.println(l1);

		// virgüllü sayılar
		Float f2 = new Float(4521);
		System.out.println(f2);

		Double d2 = new Double(4521);
		System.out.println(d2);

		// boolean
		Boolean b3 = new Boolean(true);
		System.out.println(b3);

		// char
		Character c4 = new Character('W');
		System.out.println(c4);

		// primitive
		// bilimsel gösterim
		double bilimsel = 125E+3;
		System.out.println(bilimsel);

		// primitive default değerler
		byte h1 = 0; // 1byte=8bit-1=7bit ==> 2^7=128 -128<=x<+127
		short h2 = 0;// 2byte
		int h3 = 0;// 4byte
		long h4 = 0L;// 8byte

		float h5 = 0.0f; // 4byte
		double h6 = 0.0d;// 8byte

		boolean h7 = false;// 1bit
		char h8 = '\u0000';// 2byte
	}
}
