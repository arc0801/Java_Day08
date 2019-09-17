package com.arc.inherit4;

public class PointerMain {

	public static void main(String[] args) {
		Pointer3D pointer3d = new Pointer3D();
		pointer3d.x=10;
		pointer3d.y=20;
		pointer3d.z=30;
		
		Pointer pointer = pointer3d;
		
		System.out.println(pointer.x);
		System.out.println(pointer.y);
		//System.out.println(pointer.z);
		
		//Pointer4D pointer4d = new Pointer4D();
		
		//pointer = pointer4d;
		
		pointer3d = (Pointer3D)pointer;
		System.out.println(pointer3d.z);
		
		Pointer p1 = new Pointer();
		pointer3d = (Pointer3D)p1;
		System.out.println(pointer3d.z);
		
		
	}
}
