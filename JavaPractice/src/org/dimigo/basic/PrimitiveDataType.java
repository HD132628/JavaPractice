package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "������";
		boolean man = true;
		int old=23;
		double hight = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<< ������ ������ >>");
		System.out.println("�̸� : " + name);
		if(man)
			System.out.println("���� : ����");
		else
			System.out.println("���� : ����");
		System.out.println("���� : " + old);
		System.out.println("Ű : " + hight + "cm");
		System.out.println("������ : " + weight + "kg");
		System.out.println("������ : " + bloodType + "��");
	}

}
