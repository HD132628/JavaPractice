package org.dimigo.oop;

public class PiggyBank {
	public static int balance;
	public static void putMoney(FamilyMember member, int amount){
		balance += amount;
		System.out.println(member.getMembername() + " " + amount  + "�� ����");
	}
	public static void printBalance(){
		System.out.println("���������� �� �ݾ� : " + balance + "��");
	}
}
