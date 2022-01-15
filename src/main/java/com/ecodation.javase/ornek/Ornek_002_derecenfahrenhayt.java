package com.ecodation.javase.ornek;

import java.util.Scanner;

public class Ornek_002_derecenfahrenhayt {
	/*
	 * kullanıdıcıdan aldığımız dereceyi fahrenhayta çevir program yazalım Formüllü (derece*9 /5)+32
	 * 
	 */
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		double derece, fahrenhayt;
		System.out.println("Lütfen derece giriniz");
		derece = klavye.nextDouble();
		fahrenhayt = derece * 9 / 5 + 32;
		System.out.println(derece + " derece " + fahrenhayt + " fahrenhattır");

	}
}
