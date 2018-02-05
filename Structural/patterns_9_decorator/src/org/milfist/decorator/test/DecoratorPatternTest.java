package org.milfist.decorator.test;

import org.milfist.decorator.BasicCar;
import org.milfist.decorator.Car;
import org.milfist.decorator.LuxuryCar;
import org.milfist.decorator.SportsCar;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
