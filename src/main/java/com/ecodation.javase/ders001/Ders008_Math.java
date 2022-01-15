package com.ecodation.javase.ders001;

public class Ders008_Math {
	public static void main(String[] args) {
		// MAth: hızlıca hesaplama yapmak için kullanıyoruz.
		System.out.println("pi: " + Math.PI);
		System.out.println("en küçüğü: " + Math.min(4, 55));
		System.out.println("en büyüğü: " + Math.max(4, 55));
		System.out.println("üstlü sayı: " + Math.pow(2, 5));

		System.out.println("alta yuvarlar: " + Math.floor(4.9));
		System.out.println("round yuvarlar: " + Math.round(6.5));
		System.out.println("üste yuvarlar: " + Math.ceil(4.1));

		System.out.println("mutlak değer: " + Math.abs(-4));
		System.out.println("karekök değer: " + Math.sqrt(16));

		System.out.println("üstlü sayı: " + Math.pow(Math.min(4, 9), 5));
	}
}
