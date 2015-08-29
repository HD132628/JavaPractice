package org.dimigo.inheritance;

public class FigureTest { 
 	public static void main(String[] args) { 
 		Circle c=new Circle(5); 
 		Triangle t=new Triangle(10,10,5,8); 
 		Rectangle r=new Rectangle(20,20,5,8); 
 		System.out.println("���� ����:"+String.format("%.1f", c.calcArea())); 
 		System.out.println("�ﰢ���� ����:"+t.calcArea()); 
 		System.out.println("�簢���� ����:"+r.calcArea()); 
 		c.printCenter(); 
 		t.printCenter(); 
 		r.printCenter(); 
 		c.moveFigure(5, 5); 
 		t.moveFigure(5, 5); 
 		r.moveFigure(5, 5); 
 		System.out.println("�߽���ǥ �̵�(x,y�� 5��)"); 
 		c.printCenter(); 
 		t.printCenter(); 
 		r.printCenter(); 
 		 
 
 
 	} 
 
 
}