package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
		 		 
		 		Snack[] snack = {new Snack("�����", "���", 1100, 2),	new Snack("��Ĩ", "���", 1200, 1),new Snack("��Ϲ���Ĩ", "���", 1500, 4)}; 
		 
					for(Snack s : snack) { 
		 			s.printSnack(); 
		 			System.out.println(); 
		 			System.out.println(); 
		 			sum += s.Price(); 
		 		} 		 		 
		 		System.out.println("�� ���� �ݾ� : " + String.format("%,d", sum) + "��");  
		 	} 


}
