package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method" stub
		int human = 3;
		long month  = 1700000;
		int cafe= 1500;
		long pay = (month * 12 * human * cafe);
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d",month));
		System.out.println("���� �� ���� �� : "  + String.format("%,d",human));
		System.out.println("���� �� : " + String.format("%,d",cafe));
		System.out.println("");
		System.out.println("���� �ΰǺ� : " + String.format("%,d",pay));

	}

}
