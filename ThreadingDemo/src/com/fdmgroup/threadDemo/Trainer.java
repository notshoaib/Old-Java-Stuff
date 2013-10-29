package com.fdmgroup.threadDemo;

import java.util.ArrayList;
import java.util.Random;

public class Trainer  {

	static boolean checkingProject = false;
	ArrayList<String> finalGrades = new ArrayList<String>();

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//
//		enterClassroom();
//	}
//
//	public void enterClassroom() {
//		String stuffToWrite = "Run thread: " + Thread.currentThread().getName()
//				+ " Time: " + System.currentTimeMillis()
//				+ " Entered the classroom";
//
//		System.out.println(stuffToWrite);
//		System.out.println();
//	}

	protected boolean checkProject(int x, int p) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);

		if (randomInt > x) {
			System.out.println(Thread.currentThread().getName()
					+ " Passed Phase " + p);
			return true;
		}

		else {
			System.out.println(Thread.currentThread().getName()
					+ " Has Failed Phase " + p);
			return false;
		}

	}

	protected void displayGrades() {

		for (String s : finalGrades) {
			System.out.println(s);
		}
	}

	protected String calculateGrade(int x) {
		
		x = (x * 15) + 10;
		if (x >= 90) {
			return "Distinction";
		} else if (x < 90 && x > 80) {
			return "Merit";
		} else if (x < 80 && x > 70) {
			return "Pass";
		} else
			return "Fail";

	}

}
