package com.ecodation.javase.ornek;

import java.util.Scanner;

public class Ornek_005_haftaningunleri {
	public static void main(String[] args) {
		// kullanıcının girdiği sayı haftanın hangi güne karşılık geliyor.
		// switch case 1:pazartesi 7=pazar
		Scanner klavye = new Scanner(System.in);

		while (true) {
			System.out.println("\nlütfen bir sayı giriniz");
			int sayi = klavye.nextInt();
			switch (sayi) {
				case 1:
					System.out.println("Pazartesi");
					break;
				case 2:
					System.out.println("salı");
					break;
				case 3:
					System.out.println("çarşamba");
					break;
				case 4:
					System.out.println("perşembe");
					break;
				case 5:
					System.out.println("cuma");
					break;
				case 6:
					System.out.println("cumartesi");
					break;
				case 7:
					System.out.println("Pazar");
					break;
				case -1:
					if (sayi < 0)
						System.out.println("Sistemi kapatıyorum....");
					System.exit(0);
					break;

				default:
					System.out.println("lütfen belirtilen sayı dışında sayı girmeyiniz");
					break;
			}
		}

	}
}
