package com.sample.learning.controller;

public class OddEven {
	
	int i = 1;
	int max = 10;
	boolean odd = true;
	
	public void odd() {
		synchronized (this) {
			while (i<=max) {
				while(!odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				i++;
				odd = false;
				notify();
			}
		}
	}
	
	public void even() {
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		synchronized (this) {
			while (i<=max) {
				while (odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				i++;
				odd = true;
				notify();
			}
		}
	}
	
}
