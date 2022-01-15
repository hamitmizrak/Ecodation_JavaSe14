package com.ecodation.javase.ders001;

import java.util.Scanner;

public class Ders007_Scanner {
	public static void main(String[] args) {

		// String kelime = "Java JavaScript Jsp Servlet JSF spring ";
		// String kelime = JOptionPane.showInputDialog("lütfen bir şeyler giriniz");

		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen lütfen bir şeyler giriniz");
		String kelime = klavye.nextLine();

		System.out.println(kelime.length());
		System.out.println(kelime.toUpperCase());
		System.out.println(kelime.toLowerCase());
		System.out.println(kelime.trim().length());
		System.out.println(kelime.indexOf("s"));
		System.out.println(kelime.lastIndexOf("s"));
		System.out.println(kelime.charAt(2));
		System.out.println(kelime.substring(2));
		System.out.println(kelime.substring(0, 2)); // 0<=x<=6-1
		System.out.println(kelime.concat(" Muhammet").concat(" Uğur"));
		System.out.println(kelime.startsWith("J"));
		System.out.println(kelime.endsWith("a"));
		System.out.println(kelime.contains("Jsp"));
		System.out.println(kelime.replace(kelime, "yeni kelime"));
		System.out.println(kelime.isEmpty());
		System.out.println("kimlik numarası: " + kelime.hashCode());
		System.out.println(kelime.equals("Java JavaScript Jsp Servlet JSF spring "));

	}
}
