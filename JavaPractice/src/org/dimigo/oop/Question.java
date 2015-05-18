package org.dimigo.oop; 
 

import java.util.Scanner; 
 
public class Question { 
 
 	public static void main(String[] args) { 
 		Scanner scanner = new Scanner(System.in);  
 		System.out.println("가장 좋아하는 캐릭터는?"); 
 		String answer1 = scanner.nextLine(); 
 
 		if (answer1.equals("핑크빈")) { 
 			System.out.println("정답입니다"); 
 		} else { 
 			System.out.println("틀렸습니다"); 
 		} 
 
 		System.out.println("가장 좋아하는 여캐는?"); 
 		String answer2 = scanner.nextLine(); 
 
 		if (answer2.equals("베타")) { 
 			System.out.println("정답입니다"); 
 		} else { 
 			System.out.println("틀렸습니다"); 
 		} 
 
 		System.out.println("가장 좋아하는 과목은?"); 
 		String answer3 = scanner.nextLine(); 
 
 		if (answer3.equals("수핡")) { 
 			System.out.println("정답입니다"); 
 		} else { 
 			System.out.println("틀렸습니다"); 
 		} 
 		scanner.close(); 
 	} 
 } 
