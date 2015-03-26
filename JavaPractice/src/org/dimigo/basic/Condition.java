package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car = "경차";
		int meter=10;
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리: " + meter + "km");
		System.out.println("차종 : " + car);
		System.out.printf("통행료:");
		switch(car){
		case "고속버스" :
			System.out.println(850 + 300*(meter/10-1));
			break;
		case "경차" :
			System.out.println(300 + 200*(meter/10-1));
			break;
		case "그 외" :
			System.out.println(600 + 200*(meter/10-1));
			break;
		}
	}

}
