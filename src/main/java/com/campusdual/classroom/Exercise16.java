package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		//metodos implementados en el plane
		plane.start();
		plane.stop();
		plane.maintenance();

		System.out.println("\n");

		//metodos implementados en el traktor
		tractor.start();
		tractor.stop();
		tractor.maintenance();

		System.out.println("\n");

		//metodos propios que ya tenia el plane
		plane.takeOff();
		plane.fly();
		plane.land();


		//metodos propios que ya tenia el traktor
		tractor.forward();
		tractor.backward();

	}

}
