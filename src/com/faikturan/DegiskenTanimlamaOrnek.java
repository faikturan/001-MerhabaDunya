package com.faikturan;

public class DegiskenTanimlamaOrnek {

	public static void main(String[] args) {
		byte byteSayi = (byte)6;
		short shortSayi = (short)10;
		/*
		 * int dýþýndaki veri tiplerine elle deðer atadýðýmýzda 
		 * bunlarý cast etmemiz gerekir.
		 */
		System.out.println("byteSayi: " +byteSayi);
		System.out.println("shortSayi: " +shortSayi);
		
		int intSayi = 32;
		long longSayi = 64L;
		System.out.println("intSayi: " +intSayi);
		System.out.println("longSayi: " +longSayi);
		/*
		 * long deðiþkenine elle deðer atamak için sonuna L literalini
		 * eklemiz gerekir. Aksi halde derleyici 64 deðerini int olarak
		 * kabul ederdi.
		 */
		
		int geciciInt = intSayi / 2;
		//geciciInt 16 olur intSayi deðiþmeden 32 olarak kalýr.
		System.out.println("geciciInt: " +geciciInt);
		short geciciShort = (short) (shortSayi * 2);
		System.out.println("geciciShort: " +geciciShort);
		geciciInt = geciciInt + geciciShort;//36 olur
		System.out.println("geciciInt Yeni Deðer: " +geciciInt);
		float floatSayi = 12.1F;
		float floatSayi2 = (float) 12.1;
		/*
		 * bir noktalý sayý aksi belirtilmediði sürece double kabul edilir.
		 * bu nedenle elle atamalarda atanan sayýnýn sonunda F kullanýlabilir
		 * yada (float) kullarak sayý float'a cast edilebilir.
		 */
		
		System.out.println("floatSayi:" +floatSayi);
		System.out.println("floatSayi2: " +floatSayi2);
		/*
		 * double sayýlara elle atama yaparken herhangi bir casting 
		 * iþlemine gerek yoktur.
		 */
		double doubleSayi = 124.12;
		System.out.println("doubleSayi: " +doubleSayi);
		/*
		 * bir karaktere elle atama yapýlýrken tekli týrnak iþaretleri('')
		 * içinde olduðundan emin olmalýyýz.
		 */

		 char karakter = 'A';
		 System.out.println("karakter: " +karakter);
	}

}
