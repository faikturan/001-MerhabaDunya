package com.faikturan;

public class ForKarsilastirmaOrnek {

	public static void main(String[] args) {
		int[] TekSayilarDizi = {1, 3, 5};
		System.out.println("For Dongusu ��kt�");
		System.out.println("------------------");
		for (int i = 0; i < TekSayilarDizi.length; i++) {
			System.out.println(TekSayilarDizi[i]);
		}
		System.out.println("------------------------");
		System.out.println("�zelle�mi� For D�ng�s� �rnek");
		System.out.println("--------------------------");
		for (int i : TekSayilarDizi) {
			System.out.println(i);
		}

	}

}
