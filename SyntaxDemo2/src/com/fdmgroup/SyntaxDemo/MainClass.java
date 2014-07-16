package com.fdmgroup.SyntaxDemo;

public class MainClass {
	
	public static void main(String args[]){
		
//	for(int counter=0;counter<=10;counter++){
//		System.out.println("The counters value is "+counter);
//	}
		
	String [] arrayofStrings=new String [2];
	
	arrayofStrings[0]="Hello";
	arrayofStrings[1]="World";
	
//	for(int i=0;i<arrayofStrings.length;i++){
//		System.out.println(arrayofStrings[i]);
//	}
	
	for(String thestring:arrayofStrings){
		System.out.println(thestring);
	}


}}
