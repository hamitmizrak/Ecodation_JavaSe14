package com.ecodation.javase.ders001;

public class Ders016_for {
	public static void main(String[] args) {
		// escape chracter: \" \' \n

		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
		System.out.println("**************************************");

		// for
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n**************************************");

		// while
		int y = 1;
		while (y <= 10) {
			System.out.print(y + " ");
			y++;
		}
		System.out.println("\n**************************************");

		// do-while: şart sağlansın yada sağlanmasın kesinlikle 1 kere çalışır
		int k = 1;
		do {
			System.out.print(k + " ");
			k++;
		} while (k <= 10);
	}
}
