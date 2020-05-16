package com.sample.learning.controller;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue queue;

	public Consumer(BlockingQueue queue2) {
		this.queue = queue2;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 50; i++) {
				System.out.println("Consume" + queue.take());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
