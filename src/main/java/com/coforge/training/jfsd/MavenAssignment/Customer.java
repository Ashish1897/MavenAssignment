package com.coforge.training.jfsd.MavenAssignment;

public class Customer {

		private int id;
		private String name;
		private int noItems;
		private int totalPrice;
		
		public Customer(int id, String name, int noItems, int totalPrice) {
			super();
			this.id = id;
			this.name = name;
			this.noItems = noItems;
			this.totalPrice = totalPrice;
		}
		
		public void display()
		{
		System.out.println("*********** Customer Details ************");
		System.out.println();
		
		System.out.println(this.id+" "+this.name+" "+this.noItems+" "
		+this.totalPrice);
		}
		
		
		

}
