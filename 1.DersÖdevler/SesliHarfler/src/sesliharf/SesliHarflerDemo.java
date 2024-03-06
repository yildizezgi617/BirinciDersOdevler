package sesliharf;

public class SesliHarflerDemo {
	public static void main(String[] args) {
		char harf = 'U';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("Kalın sesli Harf");
			break;

		default:
			System.out.println("ince sesli harf");
		}

	}
}
