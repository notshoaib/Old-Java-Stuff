package com.fdmgroup.threadDemo;

public class beginTraining implements Runnable {

	@Override
	public void run() {

		try {
			presenting();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("");
		sM();

	}

	public void sM() {
		boolean passed = true;
		boolean graded = false;
		String grade = new String();

		String stuffToWrite = Thread.currentThread().getName() + " Time: "
				+ System.currentTimeMillis() + " Started SafeRM";

		System.out.println(stuffToWrite);
		int i = 1;

		while (i <= 6) {

			synchronized (fdmDEMO.Craig) {
				if (passed) {
					passed = p1(10 * i, i);

				} else if (!passed) {

					grade = fdmDEMO.Craig.calculateGrade(i - 1);
					fdmDEMO.Craig.finalGrades.add(Thread.currentThread()
							.getName()
							+ " Completed Phases 1 Through "
							+ (i - 2) + " Final Grade is " + grade);
					i = 6;
					graded = true;

					try {
						System.out.println(Thread.currentThread().getName()
								+ " is waiting for final verdict");

						fdmDEMO.Craig.wait(500);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				i++;
				fdmDEMO.Craig.notifyAll();
			}
			// try {
			// ;
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
		}

		if (!graded) {

			if (!passed) {
				i = i - 1;
			}
			grade = fdmDEMO.Craig.calculateGrade(i);
			fdmDEMO.Craig.finalGrades.add(Thread.currentThread().getName()
					+ " Final Grade is " + grade);
			graded = true;
		}

		if (grade.equals("Fail")) {
			System.out.println(Thread.currentThread().getName()
					+ " is being transfered to AppSupport");
		}
	}

	private boolean p1(int x, int p) {

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return fdmDEMO.Craig.checkProject(x, p);

	}

	private synchronized void presenting() throws InterruptedException {


		
		
		System.out.println(Thread.currentThread().getName()
				+ " Finished Presenting at " + System.currentTimeMillis());
		
		notify();
		fdmDEMO.students++;

		while (fdmDEMO.students < 9) {
			wait();

		}

		notifyAll();
		System.out
				.println(Thread.currentThread().getName()
						+ " has left the assessment Room and is getting started on safeRM");
	}

}
