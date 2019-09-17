package com.arc.inherit3;

public class AnimalMain {

	public static void main(String[] args) {
		Lion lion = new Lion();
		//Animal animal = new Animal(); 
		//개념이 명확하지 않은 것들은 객체로 만들지X
		//추상클래스는 객체생성 X, 상속해서 써야 함
		lion.sleep();
		
		Eagle eagle = new Eagle();
		
		Animal animal = lion;
		animal = eagle;
		

	}

}
