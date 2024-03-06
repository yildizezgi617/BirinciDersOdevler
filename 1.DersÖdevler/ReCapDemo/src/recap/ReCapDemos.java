package recap;

public class ReCapDemos {
	public static void main(String[] args) {
		double[] mylist = { 1.3, 1.9, 4.2, 7.2 };
		double total = 0;
		double EnBuyukSayı = mylist[0];
		for (double numbers : mylist) {
			if (EnBuyukSayı < numbers) {
				EnBuyukSayı = numbers;
			}

			total = total + numbers;
			System.out.println("Toplam=" + total);

		}
		System.out.println("en buyuk sayi:" + EnBuyukSayı);
	}
}
