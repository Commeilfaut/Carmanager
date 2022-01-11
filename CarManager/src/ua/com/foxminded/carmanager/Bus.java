package ua.com.foxminded.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfPrudaction, int price, int weight, Color color) {
		super(name, yearOfPrudaction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		
		if(distanceOnService > 50000) {
			return true;
		}   else return false;
	}
  
	
}
