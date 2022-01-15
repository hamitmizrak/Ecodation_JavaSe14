package com.ecodation.javase.ders001;

public class Ders014_ifelse2 {
	public static void main(String[] args) {

		// if else
		int sayi = 3;
		if (sayi == 3) {
			System.out.println("sayı 3");
		} else {
			System.out.println("sayı 3 farklıdır");
		}

		// ternary
		String ternary = (sayi == 3) ? "sayı 3" : "sayı 3 farklıdır";
		System.out.println(ternary);

	}
}
