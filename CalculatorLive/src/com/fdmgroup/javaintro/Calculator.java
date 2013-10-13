package com.fdmgroup.javaintro;

import java.util.StringTokenizer;

public class Calculator {

	public double evaluate(String expr) {
		double result = 0;
		String re = new String();

		if (expr.length() == 1) {

			try {
				result = Double.parseDouble(expr);
			} catch (NumberFormatException nfe) {
				result = -1;
			}

			return result;
		}

		else {
			boolean mulDiv = false;

			for (int i = 0; i < expr.length(); i++) {
				if (expr.indexOf("*") != -1 || expr.indexOf("/") != -1) {
					
					mulDiv = true;
				}
			
			}
			
			if (mulDiv) {
				
				re = evalMulDiv(expr);
			
				result = evalAddSub(re);
				
				
			} else {
				result = evalAddSub(expr);

			}

			return result;
		}

	}

//evalMulDiv uses recursion to split the string expr. Each split is processed as division or multiplication and returned as
//a string with basic addition and subtraction
	public String evalMulDiv(String expr) {
		// TODO Auto-generated method stub
		double multiply = 1;
		String position;
		
		StringTokenizer mul = new StringTokenizer(expr, "*/", true);
		
		String finalString = "";



		if (plusCheck(expr)) {

			String delimiter = "\\+";
			
			String[] temp;
			
			temp = expr.split(delimiter);
			
			String totals[] = new String[temp.length];
			
			String checkme = new String();

			for (int i = 0; i < temp.length; i++) {
				
				checkme = temp[i];

				totals[i] = evalMulDiv(checkme);
			
				finalString = finalString + "+" + totals[i];
			}

			if (expr.charAt(0) == '+') {
				finalString = finalString + "-1";
			}
		}

		else if (minusCheck(expr)) {

			String delimiter = "-";
			
			String[] temp;
			
			temp = expr.split(delimiter);
			
			String totals[] = new String[temp.length];
			
			String checkme = new String();
			
			checkme = temp[0];
			
			
			totals[0] = evalMulDiv(checkme);
			
			finalString = finalString + totals[0];
			
				for (int i = 1; i < temp.length; i++) {
					checkme = temp[i];

					totals[i] = evalMulDiv(checkme);
				
					finalString = finalString + "-" + totals[i];
			}
			
				if (expr.charAt(0) == '-') {
				finalString = finalString + "-1";
			}
		}

		else {

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
			finalString = Double.toString(multiply);
		}

		return finalString;
	}
//minusCheck checks if a minus sign is present in the expression
	private boolean minusCheck(String expr) {
		
		boolean hasMinus = false;
		for (int i = 0; i < expr.length(); i++) {

			if (expr.contains("-")) {

				hasMinus = true;
			}
		}

		return hasMinus;

	}
	//plusCheck checks if a plus sign is present in the expression
	private boolean plusCheck(String expr) {
		
		boolean hasPlus = false;
		for (int i = 0; i < expr.length(); i++) {

			if (expr.contains("+")) {

				hasPlus = true;
			}
		}

		return hasPlus;

	}
	//evalAddSub processes the expression using a string tokenizer and preforms the basic addition or subtaction
	public double evalAddSub(String expr) {
		double result = 0;

		double digit;
		String number = null;
		
		StringTokenizer addSub = new StringTokenizer(expr, "+-", true);


		while (addSub.hasMoreTokens()) {

			number = addSub.nextToken();

			if (number.equals("+")) {

				result = Double.parseDouble(addSub.nextToken()) + result;

			}

			else if (number.equals("-")) {

				result = result - Double.parseDouble(addSub.nextToken());

			}

			else {
				digit = Double.parseDouble(number);
				result = result + digit;
			}
		}

		return result;

	}

}