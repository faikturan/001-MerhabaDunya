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
		
		System.out.println("-----------------G�R�LEN DE�ERLER------------");
		System.out.println("1.K���N�N ADI: " +isim[0] + ", YA�I: " +yas[0]);
		System.out.println("2.K���N�N ADI: " +isim[1] + ", YA�I: " +yas[1]);
		System.out.println("3.K���N�N ADI: " +isim[2] + ", YA�I: " +yas[2]);
		
		
		
		

	}

}
