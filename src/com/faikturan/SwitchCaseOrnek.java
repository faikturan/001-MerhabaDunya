package com.faikturan;

import java.util.Scanner;

public class SwitchCaseOrnek {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.println("L�tfen G�n Giriniz: ");
		String gun = oku.nextLine();
		switch (gun) {
		case "pazartesi": 
			System.out.println("G�n Bulundu Pazartesi");
			break;
		case "sal�":
			System.out.println("G�n Bulundu Sal�");
			break;
		case "�ar�amba":
			System.out.println("G�n Bulundu �ar�amba");
			break;
		default:
			System.out.println("G�n Bulunamad�!!!!");
			break;
		}

	}

}
