package com.ecodation.javase.ders001;

public class Ders015_ifelse_SwitchCase {
	public static void main(String[] args) {

		// örnek: 1-18 kadar sayılar olsun
		// bu sayılardan çift olanları gelsin
		// eğer bu çift içinde 12 varsa almasın devam etsin
		// ve 16 ve üstündeki sayıları almasın program dursun
		// bu şartlara uyan kaç tane sayı vardır ?
		// bu şartlara uyan çift sayıların toplamı nedir?

		int counter = 0;
		int toplam = 0;
		for (int i = 1; i <= 18; i++) {
			if (i % 2 == 0) {
				if (i == 12) {
					continue;
				}
				if (i == 16) {
					break;// döngüyü durdurur
				}
				counter++;
				System.out.print(i + " ");
				toplam = toplam + i;
			}
		}
		System.out.println("\n" + counter + " tane çift sayı vardır" + " toplamı: " + toplam);
	}

}
