package com.sample.learning.controller;

public class OddEvenSequence implements Runnable {

	static int i = 0;
	int max = 10;
	int remainder;
	static Object object = new Object();

	public OddEvenSequence(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (i < max) {
			synchronized (object) {
				while (i % 2 != remainder) {
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				i++;
				object.notifyAll();
			}
		}
	}
	
	

}
