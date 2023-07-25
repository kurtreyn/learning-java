package com.examples;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("FanAttics", 0.375, "green");

		fan.switchOn();

		fan.setSpeed((byte) 3);

		System.out.println(fan);

	}

}
