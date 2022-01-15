package com.ecodation.javase.ders001;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ders013_Date {
	public static void main(String[] args) {
		Date tarih = new Date("4/4/2019");

		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss", locale);
		String result = dateFormat.format(tarih);
		System.out.println(result);

		System.out.println(tarih);
		System.out.println(tarih.getDate());
		System.out.println(tarih.getDay());
		System.out.println(tarih.getMinutes());
		System.out.println(tarih.getHours());

	}
}
