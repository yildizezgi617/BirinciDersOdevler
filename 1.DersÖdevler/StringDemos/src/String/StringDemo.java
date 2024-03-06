package String;

import java.awt.datatransfer.SystemFlavorMap;

public class StringDemo {
	public static void main(String[] args) {
		String mesaj = "Bugun Hava Cok Guzel.";
		String mesaj2 = "       bu 2. mesaj      ";
		System.out.println("Mesaj:" + mesaj);
		System.out.println("Eleman Sayısı:" + mesaj.length());
		System.out.println("5. Elemanı: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Dışarı Çıkalım"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("k"));

		char karakterler[] = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);

		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		String yenimesaj = mesaj.replace(' ', '-');

		System.out.println(yenimesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj2.trim());
	}

}
