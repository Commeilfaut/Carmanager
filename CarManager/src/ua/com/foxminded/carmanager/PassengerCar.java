package ua.com.foxminded.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfPrudaction, int price, int weight, Color color) {
		super(name, yearOfPrudaction, price, weight, color);

	}

	@Override
	public boolean isReadyToService() {
	
		if(distanceOnService > 10000) {
			return true;
		}   else return false;
			
	}
}
	


