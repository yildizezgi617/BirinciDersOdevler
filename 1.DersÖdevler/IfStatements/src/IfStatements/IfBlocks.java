package IfStatements;

public class IfBlocks {
	public static void main(String[] args) {
		//3 sayidan en büyüğünü bulan program
		
		int sayi1= 88;
		int sayi2= 40;
		int sayi3= 22;
		
		int EnBüyükSayi = sayi1;
		
		

		if (sayi2>= EnBüyükSayi) {
			EnBüyükSayi = sayi2;
	
			}
		
		
		 if (sayi3>= EnBüyükSayi) {
			EnBüyükSayi= sayi3;
			
		}
		
		
		
		System.out.println("En Büyük Sayi :"+ EnBüyükSayi);
	}
}
