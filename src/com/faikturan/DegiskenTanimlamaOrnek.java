package com.faikturan;

public class DegiskenTanimlamaOrnek {

	public static void main(String[] args) {
		byte byteSayi = (byte)6;
		short shortSayi = (short)10;
		/*
		 * int d���ndaki veri tiplerine elle de�er atad���m�zda 
		 * bunlar� cast etmemiz gerekir.
		 */
		System.out.println("byteSayi: " +byteSayi);
		System.out.println("shortSayi: " +shortSayi);
		
		int intSayi = 32;
		long longSayi = 64L;
		System.out.println("intSayi: " +intSayi);
		System.out.println("longSayi: " +longSayi);
		/*
		 * long de�i�kenine elle de�er atamak i�in sonuna L literalini
		 * eklemiz gerekir. Aksi halde derleyici 64 de�erini int olarak
		 * kabul ederdi.
		 */
		
		int geciciInt = intSayi / 2;
		//geciciInt 16 olur intSayi de�i�meden 32 olarak kal�r.
		System.out.println("geciciInt: " +geciciInt);
		short geciciShort = (short) (shortSayi * 2);
		System.out.println("geciciShort: " +geciciShort);
		geciciInt = geciciInt + geciciShort;//36 olur
		System.out.println("geciciInt Yeni De�er: " +geciciInt);
		float floatSayi = 12.1F;
		float floatSayi2 = (float) 12.1;
		/*
		 * bir noktal� say� aksi belirtilmedi�i s�rece double kabul edilir.
		 * bu nedenle elle atamalarda atanan say�n�n sonunda F kullan�labilir
		 * yada (float) kullarak say� float'a cast edilebilir.
		 */
		
		System.out.println("floatSayi:" +floatSayi);
		System.out.println("floatSayi2: " +floatSayi2);
		/*
		 * double say�lara elle atama yaparken herhangi bir casting 
		 * i�lemine gerek yoktur.
		 */
		double doubleSayi = 124.12;
		System.out.println("doubleSayi: " +doubleSayi);
		/*
		 * bir karaktere elle atama yap�l�rken tekli t�rnak i�aretleri('')
		 * i�inde oldu�undan emin olmal�y�z.
		 */

		 char karakter = 'A';
		 System.out.println("karakter: " +karakter);
	}

}
