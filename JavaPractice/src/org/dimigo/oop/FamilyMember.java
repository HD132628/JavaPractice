package org.dimigo.oop;

public class FamilyMember {
	public static int memberCnt;
	private String memberName;
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	public String getMembername(){
		return memberName;
	}
	public static void printMemberCnt(){
		System.out.println("���� �� �ο� �� : " + memberCnt + "��");
	}
}
