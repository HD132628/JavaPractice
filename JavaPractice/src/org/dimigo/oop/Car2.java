package org.dimigo.oop;

public class Car2 {
	private String company; 
    private String model; 
    private String color; 
    private int maxSpeed; 
    private int price;
    public Car2(){
	}
    public Car2(String company,String model,String color,int maxSpeed,int price){
    	this.company=company;
    	this.model=model;
    	this.color=color;
    	this.maxSpeed=maxSpeed;
    	this.price=price;
    }
    public void printCar(){
    	System.out.println("<< �ڵ��� ��� >>");  
 		System.out.println("������� : " + company); 
 		System.out.println("�𵨸� : " +  model); 
 		System.out.println("���� : " + color); 
 		System.out.println("�ִ�ӵ� : " + maxSpeed + "km"); 
 		System.out.println("���� : " + String.format("%,d", price) + "��"); 
 		System.out.println(); 
    }

}
