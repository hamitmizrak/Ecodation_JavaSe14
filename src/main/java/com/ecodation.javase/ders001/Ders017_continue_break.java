package com.ecodation.javase.ders001;

public class Ders017_continue_break {
	public static void main(String[] args) {

		// if else if else
		int sayi = 6;
		if (sayi == 1) {
			System.out.println("sayı 1");
		} else if (sayi == 2) {
			System.out.println("sayı 2 ");
		} else if (sayi == 3) {
			System.out.println("sayı 3 ");
		} else if (sayi == 4) {
			System.out.println("sayı 4 ");
		} else if (sayi == 5) {
			System.out.println("sayı5 ");
		} else if (sayi == 6) {
			System.out.println("sayı 6 ");
		} else {
			System.out.println("sayı  farklıdır");
		}
		System.out.println("**************************");
		switch (sayi) {
			case 1:
				System.out.println("sayı 1");
				break;
			case 2:
				System.out.println("sayı 2");
				break;
			case 3:
				System.out.println("sayı 3");
				break;
			case 4:
				System.out.println("sayı 4");
				break;
			case 5:
				System.out.println("sayı 5");
				break;
			case 6:
				System.out.println("sayı 6");
				break;
			default:
				System.out.println("sayı  farklıdır");
				break;
		}

	}
}
