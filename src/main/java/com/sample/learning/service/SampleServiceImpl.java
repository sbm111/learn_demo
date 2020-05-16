package com.sample.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.sample.learning.user.A;

@Service
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	A a;
	
	private String sample;
	public void printSample(String sample) {
		this.sample = sample;
	}
	public String getSample() {
		return sample;
	}
	
	@Lookup
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	
}
