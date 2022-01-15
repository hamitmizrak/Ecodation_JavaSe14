package com.ecodation.javase.ders001;

public class Ders002_PrimitiveType {
	public static void main(String[] args) {
		// heap (pointer adresleme Java 5 gelen özellikler, çalışma zamanı:Uğur, Ascii,syntax error,Runtime error
		// stack (pointer adresleme Java 8 gelen özellikler, derleme zamanı: Muhammed,Unicode,logical error

		// primitve türler: ilkel türlerdir.
		// stack hafızada saklar
		// heap göre daha hızlıdır.
		// primitive null veremeyizzzzzz
		// serileşitrme yapamayızzzzz
		// new yazmak zorunda değiliz.

		// STACK HAFIZA
		// stack:eleman sayısı bellidir.
		// işlemimiz bittikten sonra hafızadan silinir.
		// ram tutuluyor.
		// derleme zamanında oluşuyor.
		// pointer adresleme
		// LIFO

		// HEAP HAFIZA
		// değişken eleman sayımız varsa

		// f-L float=f long=L

		// tamsayılar
		byte b1 = 127;
		System.out.println(b1);

		short s1 = 128;
		System.out.println(s1);

		int i1 = 45256;
		System.out.println(i1);

		long l1 = 4512555525252L;
		System.out.println(l1);

		// virgüllü sayılar
		float f2 = 425.45f;
		System.out.println(f2);
		double d2 = 5255.5555;
		System.out.println(d2);

		// boolean
		boolean b3 = false;
		System.out.println(b3);

		// char
		char c4 = '£';
		System.out.println(c4);

		char c5 = '\u5296';
		System.out.println(c5);

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
