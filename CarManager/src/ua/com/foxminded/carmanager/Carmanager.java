package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public class Carmanager {

	public static void main(String[] args) {
		
		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN);

		Car renaualt = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		Car renaualt2 = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(prius);
		cars.add(renaualt);
		cars.add(renaualt2);
		
		System.out.println(cars);
		
		prius.addDistance(1000);
		
		prius.addDistance(2000);
		
		prius.addDistance(15000);
		
		renaualt.addDistance(15000);
		
		System.out.println(prius);
		
		System.out.println(renaualt);

		//System.out.println(prius.equals(renaualt2));
		
		//System.out.println(renaualt.equals(renaualt2));
		
		System.out.println(prius.isReadyToService());
		
		System.out.println(renaualt.isReadyToService());
	}



	}


