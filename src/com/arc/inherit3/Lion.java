package com.arc.inherit3;

public class Lion extends Animal{

	String color;
	
	public Lion() {
		super(); //부모의 생성자를 호출. 기본적으로 존재하나 생략되어있음.
		
		
		super.age = 20;
		this.age = 25;
		
	}
	
	public void sleep() {
		System.out.println("엎드려 자기");
	}
}
