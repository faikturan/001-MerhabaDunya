package com.faikturan;

public class ArtirmaEksiltmeOperatorleriOrnek {

	public static void main(String[] args) {
		int sayi1 =5;
		int sayi2 = 5;
		
		int iOnceArtirSonuc = ++sayi1;
		int iSonraArtirSonuc = sayi2++;
		System.out.println("iOnceArtirSonuc: " +iOnceArtirSonuc);
		System.out.println("iSonraArtirSonuc: " +iSonraArtirSonuc);
		
		int iOnceEksiltSonuc = --sayi1;
		int iSonraEksiltSonuc = sayi2--;
		System.out.println("iOnceEksiltSonuc: " + iOnceEksiltSonuc);
		System.out.println("iSonraEksiltSonuc: " + iSonraEksiltSonuc);

	}

}
