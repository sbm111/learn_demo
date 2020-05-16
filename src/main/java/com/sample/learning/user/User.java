package com.sample.learning.user;

public class User {

    private String first;
    private String last;

    public User(String first, String last) {
        this.first = first;
        this.last = last;
    }

	@Override
	public String toString() {
		return "User [first=" + first + ", last=" + last + "]";
	}
}
