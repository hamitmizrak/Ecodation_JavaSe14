package com.ecodation.javase.ders001;

public class Ders001_Variable {

	public static void main(String[] args) {
		// not almak için: single comment
		/* multiple comment */
		// data type
		// üğşöç yazmayın
		// sayıyla başlamayın
		// $ veya _ ile başlayabiliriz
		int degiskenAdi = 44;
		System.out.println(degiskenAdi);
		System.out.println(args.hashCode());

		int sayi1 = 30;
		int sayi2 = 3;
		// işlem önceliği
		// (* veya /)
		// toplama
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 - sayi2);
		System.out.println(sayi1 * sayi2);
		System.out.println(sayi1 / sayi2);
		System.out.println(sayi1 % sayi2);
		System.out.println(-9 + 6 * (4 * 4 + 2 / 2));

	}

}
