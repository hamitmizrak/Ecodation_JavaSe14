package com.ecodation.javase.ornek;

import java.util.Scanner;

public class Ornek_004_negatif_pozitif {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int sayi = klavye.nextInt();
		if (sayi < 0) {
			System.out.println("sayı negatiftir");

		} else {
			System.out.println("Sayı pozitif");
		}
	}
}
