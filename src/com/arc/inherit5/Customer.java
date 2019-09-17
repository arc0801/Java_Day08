package com.arc.inherit5;

import java.util.Scanner;

public class Customer {

	int money;
	int point;



	//메서드명은  buy
	//물건값을 계산, 남아있는 금액, 포인트 출력

	/*
	public void buy(int m, int p) {
		this.money=this.money - m;
		this.point=this.point + p;

		System.out.println(this.money);
		System.out.println(this.point);
	}
	 */

	public void buy(Product p) {
		this.money=this.money - p.price;
		this.point=this.point + p.point;

		System.out.println(this.money);
		System.out.println(this.point);
	}

	//buy 한 개 이상의 물품구입, 매개변수 1개
	//물건값을 계산, 남아있는 금액, 포인트 출력

	public void buy(Product [] ar) {
		for(int i=0;i<ar.length;i++) {
			this.money=this.money - ar[i].price;
			this.point=this.point + ar[i].point;
		}

		System.out.println(this.money);
		System.out.println(this.point);
	}






}
