package com.ecodation.javase.ders001;

import java.util.Random;

public class Ders009_Random {
	public static void main(String[] args) {

		System.out.println(Math.floor(Math.random() * 3 + 1));
		System.out.println("*********************************");

		// object Random tavsiye edilen
		Random random = new Random();
		int sayi = random.nextInt(3) + 1;
		System.out.println(sayi);
	}
}
