package com.sample.learning.controller;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue queue;

	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 50; i++) {
				queue.put(i);
				System.out.println("Produce"+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
