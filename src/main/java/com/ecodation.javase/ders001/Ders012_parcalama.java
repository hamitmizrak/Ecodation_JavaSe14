package com.ecodation.javase.ders001;

import java.util.StringTokenizer;

public class Ders012_parcalama {
	public static void main(String[] args) {
		String kelime = "Merhabalar & java,javascript,node,Vue,REact,JSP,JSF";
		// 1-)split
		String[] dizi = kelime.split(",");
		for (String temp : dizi) {
			System.out.println(temp);
		}
		System.out.println("*******************");
		// 2-) StringTokenizer
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, ",");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}

	}
}
