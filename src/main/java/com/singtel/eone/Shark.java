package com.singtel.eone;

public class Shark extends Animal{

	@Override
	public boolean swim() {
		return true;
	}

	@Override
	public boolean walk() {
		return false;
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public boolean sing() {
		return false;
	}

}
