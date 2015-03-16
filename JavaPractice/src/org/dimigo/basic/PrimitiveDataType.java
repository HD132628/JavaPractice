package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean man = true;
		int old=23;
		double hight = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		if(man)
			System.out.println("성별 : 남자");
		else
			System.out.println("성별 : 여자");
		System.out.println("나이 : " + old);
		System.out.println("키 : " + hight + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
	}

}
