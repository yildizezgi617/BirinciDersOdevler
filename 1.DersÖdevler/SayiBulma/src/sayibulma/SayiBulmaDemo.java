package sayibulma;

public class SayiBulmaDemo {
	public static void main(String[] args) {

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
			System.out.println("Sayı mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}
	}

}
