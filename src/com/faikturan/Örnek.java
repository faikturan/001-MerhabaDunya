package com.faikturan;

import java.util.Scanner;

public class �rnek {

	public static void main(String[] args) {
	 int yas;
	 int sinif;
	 Scanner input  =new Scanner(System.in);
	 
	 System.out.println("Enter ya��n�z� : ");
	 yas=input.nextInt();
	 System.out.println("Enter sinif : ");
	 sinif=input.nextInt();

	 if(yas>18 && ( sinif==3 || sinif==4))
	 {
		 System.out.println("kay�t ba�ar�l� ");
		 
	 }
	 else if(yas<18 && (sinif==1 || sinif==2))
	 {
		 
		 System.out.println("kay�t ba�ar�l� ");
	 }
	 else
	 {
		 System.out.println("kay�t ba�ar�s�z");
	 }
		 
	 
	 
	 
	 
	}

}
