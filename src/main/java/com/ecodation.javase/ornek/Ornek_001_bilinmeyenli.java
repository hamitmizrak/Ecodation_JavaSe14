package com.ecodation.javase.ornek;

import java.util.Scanner;

public class Ornek_001_bilinmeyenli {
	/*
	 * kullanıcıdan aldığımız x=2 ve k=5 sayısını hesaplayan algoritma y=3x+4k x=2; k=5;
	 * 
	 */
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int y, x, k;

		System.out.println("lütfen x değerini giriniz");
		x = klavye.nextInt();

		System.out.println("lütfen k değerini giriniz");
		k = klavye.nextInt();

		y = 3 * x + 4 * k;
		System.out.println("sonuc: " + y);

	}
}
