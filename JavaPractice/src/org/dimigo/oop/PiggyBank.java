package org.dimigo.oop;

public class PiggyBank {
	public static int balance;
	public static void putMoney(FamilyMember member, int amount){
		balance += amount;
		System.out.println(member.getMembername() + " " + amount  + "원 넣음");
	}
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
