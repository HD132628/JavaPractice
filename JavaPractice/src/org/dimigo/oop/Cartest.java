package org.dimigo.oop; 

public class Cartest { 
     public static void main(String argv[]) 
     { 
         Car genesis = new Car();
         genesis.setCompany("�����ڵ���"); 
         genesis.setColor("������");
         genesis.setMaxSpeed(225);
         genesis.setModel("���׽ý�");
         genesis.setPrice(50000000);
         System.out.println("<�ڵ��� ���>");
         System.out.println("������� : "+genesis.getCompany()); 
         System.out.println("�𵨸� : "+genesis.getModel()); 
         System.out.println("���� : "+genesis.getColor());
         System.out.println("�ִ�ӵ� : "+genesis.getMaxSpeed());
         System.out.println("���� : "+String.format("%,d",genesis.getPrice())); 
         Car k7 = new Car();
         k7.setCompany("����ڵ���"); 
         k7.setColor("���");
         k7.setMaxSpeed(246);
         k7.setModel("K7");
         k7.setPrice(400000000); 
         System.out.println("<�ڵ��� ���>"); 
         System.out.println("������� : " + k7.getCompany()); 
         System.out.println("�𵨸� : " + k7.getModel()); 
         System.out.println("���� : " + k7.getColor()); 
         System.out.println("�ִ�ӵ� : " + k7.getMaxSpeed()); 
         System.out.println("���� : "+String.format("%,d", k7.getPrice())); 
         Car sm7 = new Car(); 
         sm7.setCompany("�Ｚ�ڵ���"); 
         sm7.setColor("ȸ��"); 
         sm7.setMaxSpeed(200); 
         sm7.setModel("SM7"); 
         sm7.setPrice(38000000); 
         System.out.println("<�ڵ��� ���>"); 
         System.out.println("������� : " + sm7.getCompany()); 
         System.out.println("�𵨸� : " + sm7.getModel()); 
         System.out.println("���� : " + sm7.getColor()); 
         System.out.println("�ִ�ӵ� : " + sm7.getMaxSpeed()); 
         System.out.println("���� : "+String.format("%,d", sm7.getPrice())); 
     } 
 }