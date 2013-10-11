package com.fdmgroup.javaintro;

import java.util.StringTokenizer;

public class Calculator {

	public double evaluate(String expr) {
		double result = 0;
		String re=new String();

		if (expr.length() == 1) {

			try {
				result = Double.parseDouble(expr);
			} catch (NumberFormatException nfe) {
				result = -1;
			}

			return result;
		}

		else {
			boolean addition = false;
			boolean subtraction = false;

			for (int i = 0; i < expr.length(); i++) {
				if (expr.indexOf("*") != -1) {
//
				addition = true;
				}
//				if (expr.indexOf("-") != -1) {
//
//					subtraction = true;
//				}
//
		}
//			
			if (addition){
				re=evalMulDiv(expr);
				
				result=evalAddSub(re);
		}
			else{
				result = evalAddSub(expr);
			}
//			}
			
//			else if (addition) {
//				result = evalAddition(expr);
//			}
//
//			else if (subtraction) {
//				result = evalSubtraction(expr);
//
//			}
			return result;
		}

	}

	public String evalMulDiv(String expr) {
		// TODO Auto-generated method stub
		double multiply = 1;
		String position;
		StringTokenizer mul = new StringTokenizer(expr, "*/", true);
		String finalString="";
		

		int start=0;
		
		
		if(plusminusCheck(expr)){
			
		String delimiter = "\\+";
		String[] temp;
		temp = expr.split(delimiter);
		String totals[]=new String [temp.length];
		String checkme=new String();
		
		for(int i=0;i<temp.length;i++){
			checkme=temp[i];
			
			totals[i]=evalMulDiv(checkme);
		//	totals[i]=evalMulDiv(checkme);
			finalString=finalString+"+"+totals[i];
		}
		
		}
		

		else{
			
		while (mul.hasMoreTokens()) {
			position = mul.nextToken();
			
			

			if (position.equals("*")) {
				multiply = Double.parseDouble(mul.nextToken()) * multiply;
				

				
			} else if (position.equals("/")) {
				multiply = multiply / Double.parseDouble(mul.nextToken());
			
			}
			
			
	
				else {
				multiply = Double.parseDouble(position);
				
			}
			
		}
			finalString=Double.toString(multiply);
		}

		return finalString;
	}

private boolean plusminusCheck(String expr) {
	boolean hasPlus=false;
	for(int i=0;i<expr.length();i++){
		
		if(expr.contains("+")){
			
			hasPlus=true;
		}
	}

	return hasPlus;
		
	}

//	public double evalAddition(String expr) {
//		double result = 0;
//		String total = null;
//
//		StringTokenizer add = new StringTokenizer(expr, "+");
//
//		while (add.hasMoreTokens()) {
//
//			total = add.nextToken();
//			result = Double.parseDouble(total) + result;
//
//		}
//
//		return result;
//
//	}
//
//	public double evalSubtraction(String expr) {
//		StringTokenizer sub = new StringTokenizer(expr, "-");
//		double result = 0;
//
//		String[] difference = new String[sub.countTokens()];
//		int i = 0;
//		while (sub.hasMoreTokens()) {
//
//			difference[i] = sub.nextToken();
//			i++;
//
//		}
//		result = Double.parseDouble(difference[0]) * 2;
//		for (int j = 0; j < difference.length; j++) {
//
//		
//			result = result - Double.parseDouble(difference[j]);
//			System.out.println(result);
//
//		}
//		return result;
//	}
	
	public double evalAddSub(String expr){
		double result=0;
		
		double digit;
		String number = null;
		String newString=null;
		StringTokenizer addSub = new StringTokenizer(expr,"+-%*",true);
		
		double prev=0;
		
		String previous;
		

	

		while (addSub.hasMoreTokens()) {

			
			number = addSub.nextToken();
			
			if(number.equals("+")){
				
			result = Double.parseDouble(addSub.nextToken()) + result;
			
			}
			
			else if(number.equals("-")){
				
				result=result-Double.parseDouble(addSub.nextToken());
				
			}
			
		
		
			else{
				digit=Double.parseDouble(number);
				result=result+digit;
		}
		}
		
		
//			System.out.println(result);
		return result;
		
		
	}
	
}