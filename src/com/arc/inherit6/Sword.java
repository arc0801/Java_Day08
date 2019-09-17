package com.arc.inherit6;

public class Sword implements Weapon{

	@Override
	public void attack() {
		this.slash();
	}

	public void slash() {
		System.out.println("칼로 공격");
	}
}
