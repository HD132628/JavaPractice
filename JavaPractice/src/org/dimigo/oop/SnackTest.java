package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
		 		 
		 		Snack[] snack = {new Snack("»õ¿ì±ø", "³ó½É", 1100, 2),	new Snack("ÄÜÄ¨", "³ó½É", 1200, 1),new Snack("Çã´Ï¹öÅÍÄ¨", "³ó½É", 1500, 4)}; 
		 
					for(Snack s : snack) { 
		 			s.printSnack(); 
		 			System.out.println(); 
		 			System.out.println(); 
		 			sum += s.Price(); 
		 		} 		 		 
		 		System.out.println("ÃÑ ±¸¸Å ±Ý¾× : " + String.format("%,d", sum) + "¿ø");  
		 	} 


}
