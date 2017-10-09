package com.faikturan;

import java.util.Scanner;

public class DiziOrnek {

	public static void main(String[] args) {
		int yas[] = new int[3];
		String [] isim = new String[3];
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. kisinin adini giriniz: ");
		isim[0] = s.next();
		System.out.println("1. kisinin yasini giriniz: ");
		yas[0] = s.nextInt();
		
		
		System.out.println("2. kisinin adini giriniz: ");
		isim[1] = s.next();
		System.out.println("2. kisinin yasini giriniz: ");
		yas[1] = s.nextInt();
		
		
		System.out.println("3. kisinin adini giriniz: ");
		isim[2] = s.next();
		System.out.println("3. kisinin yasini giriniz: ");
		yas[2] = s.nextInt();
		
		System.out.println("-----------------GÝRÝLEN DEÐERLER------------");
		System.out.println("1.KÝÞÝNÝN ADI: " +isim[0] + ", YAÞI: " +yas[0]);
		System.out.println("2.KÝÞÝNÝN ADI: " +isim[1] + ", YAÞI: " +yas[1]);
		System.out.println("3.KÝÞÝNÝN ADI: " +isim[2] + ", YAÞI: " +yas[2]);
		
		
		
		

	}

}
