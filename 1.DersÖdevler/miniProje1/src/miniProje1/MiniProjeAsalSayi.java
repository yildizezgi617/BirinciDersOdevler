package miniProje1;

public class MiniProjeAsalSayi {
	public static void main(String[] args) {
		int sayi = 17;
		
		
		boolean asalmi = true;
		if(sayi==1) {
			System.out.println("Sayi asal değildir");
			return;
		}
		if(sayi<1) {
			System.out.println("Geçersiz Sayi");
			return;
		}
		for (int i = 2; i < sayi; i++) {

			if (sayi % i == 0) {
				asalmi = false;

			}
		}
		
		if (asalmi) {
				System.out.println("Sayi asaldir");
			

		}
		else {
			System.out.println("Sayi Asal Değildir");
		}

	}

}
