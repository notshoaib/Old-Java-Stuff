package com.fdmgroup.pojo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String... args){
		Person user = new User();
		List<User> list = new ArrayList<User>();
		
		if(user instanceof User){
		((User)user).study();
		}
	}
	
	public static void go(byte x){
		System.out.println("in byte");
	}
	
	public static void go(short x){
		System.out.println("in short");
	}
	public static void go(long x){
		System.out.println("in long");
	}
	
	

}
