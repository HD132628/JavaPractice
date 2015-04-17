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
    	System.out.println("<< 자동차 목록 >>");  
 		System.out.println("제조사명 : " + company); 
 		System.out.println("모델명 : " +  model); 
 		System.out.println("색상 : " + color); 
 		System.out.println("최대속도 : " + maxSpeed + "km"); 
 		System.out.println("가격 : " + String.format("%,d", price) + "원"); 
 		System.out.println(); 
    }

}
