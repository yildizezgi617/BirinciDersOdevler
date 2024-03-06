package methodlar;

public class MethodsDemo {
	public static void main(String[] args) {

		SayiBulmaca();
		SayiBulmaca();
		SayiBulmaca();
		SayiBulmaca();

	}

	public static void SayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 9, 6, 3, 7 };

		int aranacak = 5;
		boolean varmi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varmi = true;
				break;
			}
		}
		if (varmi) {
			mesajVer(aranacak);
		} else {
			System.out.println("Sayı mevcut değildir");
		}
	}

	public static void mesajVer(int aranacak) {
		System.out.println("Sayı Mevcuttur" + aranacak);
	}
}
