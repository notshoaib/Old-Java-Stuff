package com.fdmgroup.overloadingdemo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String... args) {
	Parent child = new Child();
	System.out.println(child.getName());
	}
	public static void go(int x){
		System.out.println("Matched int");
		
	}
	public static void go(long x){
		System.out.println("Matched long");
	}
	
//	public static void varargsMethod(String required, int... strings){
//		System.out.println(required);
//		for(String string:strings)
//			System.out.println(string);
//	}
//	public static void go(short x){
//		System.out.println("Matched short");
//	}


}
