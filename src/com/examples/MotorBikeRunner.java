package com.examples;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike somethingElse = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);
		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);
		honda.increaseSpeed(100);
		honda.decreaseSpeed(50);
		System.out.println(honda.getSpeed());

//		ducati.setSpeed(20);

	}

}
