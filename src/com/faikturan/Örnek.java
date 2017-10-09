package com.faikturan;

import java.util.Scanner;

public class Örnek {

	public static void main(String[] args) {
	 int yas;
	 int sinif;
	 Scanner input  =new Scanner(System.in);
	 
	 System.out.println("Enter yaþýnýzý : ");
	 yas=input.nextInt();
	 System.out.println("Enter sinif : ");
	 sinif=input.nextInt();

	 if(yas>18 && ( sinif==3 || sinif==4))
	 {
		 System.out.println("kayýt baþarýlý ");
		 
	 }
	 else if(yas<18 && (sinif==1 || sinif==2))
	 {
		 
		 System.out.println("kayýt baþarýlý ");
	 }
	 else
	 {
		 System.out.println("kayýt baþarýsýz");
	 }
		 
	 
	 
	 
	 
	}

}
