package com.faikturan;

import java.util.Random;
import java.util.Scanner;

public class HesapIslemleriV3 {

	public static void main(String[] args) {
		Random random = new Random();
		double bakiye = (double)random.nextInt(2000);
		double cekilecek = 0;
		double limit = 500;
		System.out.println("�u anki bakiyeniz: " +bakiye);
		System.out.println("L�tfen �ekmek istedi�iniz miktari giriniz:");
		Scanner s = new Scanner(System.in);
		cekilecek = s.nextDouble();
		if (cekilecek <= bakiye && cekilecek <= limit) {
			bakiye = bakiye -cekilecek;
			System.out.println("�ekilen para miktar�: " +cekilecek);
			System.out.println("Kalan para miktar�: " +bakiye);
		}
		else
		{
			System.out.println("Hesab�n�zda yeterli miktarda bakiye yok\n"
					+ "veya �ekmek istedi�iniz miktar i�lem limitinizden fazla.");
		}
	}

	}

