package loops;

public class LoopExamplesDemos {
	public static void main(String[] args) {
	
		
//1 den 10 a kadar sayma
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}
		System.out.println("Döngü Bitti");
//1den 10 a kadar tek sayıları yazdırma
		for (int j = 1; j <= 10; j += 2) {
			System.out.println(j);

		}
		System.out.println("For Döngüsü Bitti");

		int i = 1;
//While Döngüsü ile 1den 10 a Kadar 
		while (i < 10) {
			System.out.println(i);
			i += 2;

		}
		System.out.println("While Döngüsü Bitti");
		
		
		
//Do While Döngüsü
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		
		} while (j<10);
		System.out.println("Do While Döngüsü Bitti");
		

	}
}