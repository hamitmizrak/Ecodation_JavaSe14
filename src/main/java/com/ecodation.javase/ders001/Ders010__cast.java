package com.ecodation.javase.ders001;

public class Ders010__cast {
	public static void main(String[] args) {

		// 1-) f-L
		float f1 = 14.55f;
		long l1 = 55115L;

		// 2-)
		// String to int (Stringten integere çevirmek
		String str = "5";
		// 1.yol
		int sayi1 = Integer.valueOf(str);
		System.out.println(sayi1 * 5);
		// 2.yol
		int sayi2 = Integer.parseInt(str);
		System.out.println(sayi2 * 5);

		// 3-)
		// int to String
		int sayi3 = 5;
		String str2 = String.valueOf(sayi3);
		String str3 = Integer.toString(sayi3);

		// 4-) boxing:primitive bir türü wrapper çevirmek
		int primitive = 4;
		Integer wrapper = primitive;

		// 5-) unboxing: wrapper primitive bir türü çevirmek
		Integer wrapper2 = new Integer(455);
		int primitive2 = wrapper2;
	}
}
