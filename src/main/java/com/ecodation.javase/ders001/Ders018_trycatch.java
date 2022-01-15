package com.ecodation.javase.ders001;

public class Ders018_trycatch {
	public static void main(String[] args) {

		// try-catch: eğer sistemde bir hata olursa bu hatayı yakalıp ilgili kişiye göstermesi

		try {
			System.out.println("sonuc1");
			int sayi = 3 / 0; // tanımsız

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("sonuc2");

	}
}
