package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method" stub
		int human = 3;
		long month  = 1700000;
		int cafe= 1500;
		long pay = (month * 12 * human * cafe);
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d",month));
		System.out.println("점포 내 직원 수 : "  + String.format("%,d",human));
		System.out.println("점포 수 : " + String.format("%,d",cafe));
		System.out.println("");
		System.out.println("연간 인건비 : " + String.format("%,d",pay));

	}

}
