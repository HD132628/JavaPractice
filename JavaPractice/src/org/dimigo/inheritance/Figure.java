package org.dimigo.inheritance;

public class Figure { 
 	private int centerX; 
 	private int centerY; 
 	public Figure(int centerX,int centerY){ 
 		this.centerX=centerX; 
 		this.centerY=centerY; 
 	} 
 	protected double calcArea(){ 
 		return 0; 
 		 
 	} 
 	protected void printCenter(){ 
 		System.out.println("�߽���ǥ:("+centerX+","+centerY+")"); 
 	} 
 	protected void moveFigure(int x,int y){ 
 		centerX+=x; 
 		centerY+=y; 
 	} 
 
 
} 