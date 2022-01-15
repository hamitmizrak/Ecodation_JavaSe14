package com.ecodation.javase.ders001;

public class Ders011__birlestirme {
	public static void main(String[] args) {

		// 1. + (operand) birleştirme
		String adi = "Hamit";
		String soyadi = " Mızrak";
		String birlestir = adi + soyadi;
		System.out.println(birlestir);

		// 2. concat birleştirme
		String sonuc = adi.concat(" 1.son").concat(" 2.son");
		System.out.println(sonuc);

		// 3. StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("Batuhan").append(" HAlimoğlu").append(" Elektrik Müh");
		String sonuc2 = builder.toString();
		System.out.println(sonuc2);

		// 4. StringBuffer:daha güvenli ancak yavaş: Senkrondur yani bir iş bitmeden diğerine geçmez
		StringBuffer buffer = new StringBuffer();
		buffer.append("Batuhan").append(" HAlimoğlu").append(" Elektrik Müh");
		String sonuc3 = buffer.toString();
		System.out.println(sonuc3);

	}
}
