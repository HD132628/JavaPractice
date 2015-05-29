package org.dimigo.oop;

public class Snack {
		private String company;
		private String name;
		private int price;
		private int number;
		public Snack(){
		}
		public Snack(String company, String name , int price , int number){
			this.company=company;
			this.name=name;
			this.price=price;
			this.number=number;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public void printSnack() { 
		 	System.out.println( "�̸�	:" + this.name + "\n" + "������	:" + this.company + "\n" +	"���� 	:" + String.format("%,d", this.price) + "��" + "\n" + "����	:" + String.format("%,d", this.number) + "��"); 
		 	} 
	 	public int Price() { 
	 		return this.price * this.number; 
	 	} 
}
