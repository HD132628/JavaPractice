package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car = "����";
		int meter=10;
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ�: " + meter + "km");
		System.out.println("���� : " + car);
		System.out.printf("�����:");
		switch(car){
		case "��ӹ���" :
			System.out.println(850 + 300*(meter/10-1));
			break;
		case "����" :
			System.out.println(300 + 200*(meter/10-1));
			break;
		case "�� ��" :
			System.out.println(600 + 200*(meter/10-1));
			break;
		}
	}

}
