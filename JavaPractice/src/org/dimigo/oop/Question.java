package org.dimigo.oop; 
 

import java.util.Scanner; 
 
public class Question { 
 
 	public static void main(String[] args) { 
 		Scanner scanner = new Scanner(System.in);  
 		System.out.println("���� �����ϴ� ĳ���ʹ�?"); 
 		String answer1 = scanner.nextLine(); 
 
 		if (answer1.equals("��ũ��")) { 
 			System.out.println("�����Դϴ�"); 
 		} else { 
 			System.out.println("Ʋ�Ƚ��ϴ�"); 
 		} 
 
 		System.out.println("���� �����ϴ� ��ĳ��?"); 
 		String answer2 = scanner.nextLine(); 
 
 		if (answer2.equals("��Ÿ")) { 
 			System.out.println("�����Դϴ�"); 
 		} else { 
 			System.out.println("Ʋ�Ƚ��ϴ�"); 
 		} 
 
 		System.out.println("���� �����ϴ� ������?"); 
 		String answer3 = scanner.nextLine(); 
 
 		if (answer3.equals("����")) { 
 			System.out.println("�����Դϴ�"); 
 		} else { 
 			System.out.println("Ʋ�Ƚ��ϴ�"); 
 		} 
 		scanner.close(); 
 	} 
 } 
