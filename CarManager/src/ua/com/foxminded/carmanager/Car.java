package ua.com.foxminded.carmanager;

public abstract class Car implements Serviceable  {

	String name;
	int yearOfPrudaction;
	int price;
	int weight;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	public Car(String name, int yearOfPrudaction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfPrudaction = yearOfPrudaction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	public void addDistance(int additinalDistance) {
		
		distance += additinalDistance;
		distanceOnService += additinalDistance;
	}
	
	public void addDistance(double additinalDistance) {
		
		distance += additinalDistance;
		distanceOnService += additinalDistance;
	}
	
	
	public int getDistanceOnService() {
		return distanceOnService;
	}

	public int getDistance() {
		return distance;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + yearOfPrudaction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color != other.color)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfPrudaction != other.yearOfPrudaction)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfPrudaction=" + yearOfPrudaction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}
	
	
	
	
}
