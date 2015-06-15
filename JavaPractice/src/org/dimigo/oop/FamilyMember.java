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
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
