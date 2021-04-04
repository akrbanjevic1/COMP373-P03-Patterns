package Bridge;

public abstract class Vehicle {
	PriceClass priceclass;
	
	public Vehicle(PriceClass priceclass) {
		this.priceclass = priceclass;
	}
	
	abstract public String getVehicle(); //this method would return a string describing the segment and type of vehicle
	abstract public void setVehicleName(String name); //This allows the user to set a name (for example, toyota camry)
	abstract public String getVehicleName();
	
}
