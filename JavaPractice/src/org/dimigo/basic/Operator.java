package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a=9,b=10;
		double c=5.8d,d=5.4d;
		double s1,s2;
		s1=(a+b)*c/2;
		s2=a*d;
		System.out.println("<<도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + s1);
		System.out.println("평행사변형 넓이 : " + s2);
		System.out.println("");
		System.out.println("사다리꼴이 평행사변형 보다 " + (s1-s2) + " 더 큽니다.");
		
	}

}
