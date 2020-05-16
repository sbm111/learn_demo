package com.sample.learning.controller;

@FunctionalInterface
public interface ArithMAtic {
	
	void test1();
	
	public static void test() {
		System.out.println("yes");
	}
	
	public static int add(int a , int b) {
		return a+b;
	}

}
