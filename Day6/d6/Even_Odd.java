package com.demo.d6;

public class Even_Odd implements Runnable {
	static Thread evenThread;
	static Thread oddThread;

	public static void main(String[] args) {
		Even_Odd EvenOdd = new Even_Odd();

		oddThread = new Thread(EvenOdd, "OddThread");
		evenThread = new Thread(EvenOdd, "EvenThread");

		oddThread.start();
		evenThread.start();
	}

	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("OddThread")) 
				evenThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("EvenThread")) {
				if (i % 2 == 0) System.out.println(i);
			} 

			if (Thread.currentThread().getName().equals("OddThread")) {
				if (i % 2 == 1) System.out.println(i);
			}
		}
	}

}
