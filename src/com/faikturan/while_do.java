package com.faikturan;

public class while_do {

	public static void main(String[] args) {
		int i = 100;
		do {
			
			if(i % 4 == 0)
				System.out.println("mode by 4 is : " +i);
			i--;
			
		} while (i>0);
		
		System.out.println("app is done");
	}

}
