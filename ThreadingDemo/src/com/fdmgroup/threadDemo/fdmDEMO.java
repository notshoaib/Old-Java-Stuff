package com.fdmgroup.threadDemo;

import java.util.Vector;


public class fdmDEMO {

	/*
	 * This Threading Demo will simulate the FDM experience
	 */

	static Trainer Craig = new Trainer();
	static boolean somebodyPresenting = false;
	static int students = 0;
	

	public static void main(String[] args) throws InterruptedException {

		beginTraining Trainees = new beginTraining();

		Vector<Thread> allThreads = new Vector<Thread>();

		for (int i = 0; i < 9; i++) {
			// each thread gets a runnable object and a name
			allThreads.add(new Thread(Trainees, "StudenT " + i));
		}

		for (Thread t : allThreads) {
			t.start();
		}

		for (Thread t : allThreads) {
			t.join();
		}
		
		System.out.println("");
		Craig.displayGrades();
	}
}