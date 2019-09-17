package com.arc.inherit5;

public class HimartMain {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.brand = "LG";
		tv.size = 100;
		tv.color = "Black";
		tv.price = 500;
		tv.point = 50;
		
		Com com = new Com();
		com.brand = "LG";
		com.cpu = "i7";
		com.price = 160;
		com.point = 16;
		
		Phone ph = new Phone();
		ph.brand = "Samsung";
		ph.model = "Note10+";
		ph.color = "Silver";
		ph.price = 150;
		ph.point = 15;
		
		Customer iu = new Customer();
		iu.money = 2000;
		iu.point = 0;
		
		Product [] ar = new Product[2];
		ar[0]=tv;
		ar[1]=com;
		
		iu.buy(ar);
		
		
		
	}
	

}
