package com.faikturan;

import java.util.Scanner;

public class SwitchCaseOrnek {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.println("Lütfen Gün Giriniz: ");
		String gun = oku.nextLine();
		switch (gun) {
		case "pazartesi": 
			System.out.println("Gün Bulundu Pazartesi");
			break;
		case "salý":
			System.out.println("Gün Bulundu Salý");
			break;
		case "çarþamba":
			System.out.println("Gün Bulundu Çarþamba");
			break;
		default:
			System.out.println("Gün Bulunamadý!!!!");
			break;
		}

	}

}
