package com.sample.learning.controller;

import java.io.Serializable;

public class A implements Serializable,Cloneable{

	private static final long serialVersionUID = -9052818382344049883L;

	private A() {
		if(a != null) {
			throw new RuntimeException("No No ohh No");
		}
	};
	
	private static A a = new A();
	
	static Object lock = new Object();
	
	public static synchronized A getA() {
		return a;
	}

	protected Object readResolve() {
	    return getA();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getA();
	}
}